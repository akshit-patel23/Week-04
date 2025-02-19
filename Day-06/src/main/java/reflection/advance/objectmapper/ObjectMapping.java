package reflection.advance.objectmapper;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class ObjectMapping {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        T obj=clazz.getDeclaredConstructor().newInstance();

        for(Field field: clazz.getDeclaredFields()){
            if(properties.containsKey(field.getName())){
                field.setAccessible(true);
                Object value=properties.get(field.getName());
                field.set(obj,value);

            }
        }
        return obj;
    }
}
