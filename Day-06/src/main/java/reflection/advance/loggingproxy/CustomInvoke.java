package reflection.advance.loggingproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomInvoke implements InvocationHandler {

    private final Object target;

    public CustomInvoke(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before Call: " + method.getName());

        Object result = method.invoke(target, args);

        System.out.println("After Call: " + method.getName());

        return result;
    }
}
