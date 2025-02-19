package reflection.advance.executiontiming;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public class PersonMain {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<?> classDemo = Class.forName("reflection.advance.executiontiming.Person");
        Object obj =classDemo.getDeclaredConstructor().newInstance();

        Method method= obj.getClass().getDeclaredMethod("show");

        long start=System.nanoTime();
        method.invoke(obj);
        long end=System.nanoTime();

        System.out.println("The time taken by method :- "+(end-start));
    }
}
