package reflection.basic.dynamicallyobjectcreate;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static java.lang.reflect.Proxy.newProxyInstance;

public class StudentMain {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> cls=Student.class;
        Constructor<?> constructor=cls.getConstructor(String.class);
        constructor.newInstance("Dev");
    }
}
