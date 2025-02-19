package reflection.advance.injection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Map;

public class Injectioncode {

    public static <T> T add(Class<T> clazz, Map<String, Object> dependencies) {
        try {
            // Step 1: Find Constructor with @Inject annotation
            Constructor<?> constructor = null;
            for (Constructor<?> c : clazz.getDeclaredConstructors()) {
                if (c.isAnnotationPresent(Inject.class)) {
                    constructor = c;
                    break;
                }
            }

            // If no @Inject constructor found, use default constructor
            if (constructor == null) {
                constructor = clazz.getDeclaredConstructor();
            }

            // Step 2: Resolve constructor parameters safely
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Object[] args = new Object[parameterTypes.length];
            for (int i = 0; i < parameterTypes.length; i++) {
                final Class<?> parameterType = parameterTypes[i]; // Make it final in lambda only final ya effectively final var are allowed
                String paramName = parameterType.getSimpleName().toLowerCase();
                args[i] = dependencies.computeIfAbsent(paramName, k -> {
                    try {
                        return parameterType.getDeclaredConstructor().newInstance(); // Now it's fine
                    } catch (Exception e) {
                        throw new RuntimeException("Failed to instantiate dependency for " + paramName, e);
                    }
                });
            }


            T obj = (T) constructor.newInstance(args);

            // Step 4: Inject fields if needed
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                if (dependencies.containsKey(field.getName())) {
                    field.set(obj, dependencies.get(field.getName()));
                } else {
                    Object dependency = field.getType().getDeclaredConstructor().newInstance();
                    dependencies.put(field.getName(), dependency);
                    field.set(obj, dependency);
                }
            }

            return obj;

        } catch (Exception e) {
            throw new RuntimeException("Dependency injection failed", e);
        }
    }
}
/*paramTypes[] → Constructor ke parameter types ko represent karta hai.
args[] → Un parameter types ke corresponding objects ko store karta hai*/
