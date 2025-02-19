package reflection.basic.invokeprivate;

import reflection.basic.invokeprivate.Calculator.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CalculatorMain {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Calculator cal1=new Calculator();
        Class<?> cls1=cal1.getClass();
        Method method= cls1.getDeclaredMethod("calculate",int.class,int.class);
        method.setAccessible(true);

        int ans = (int) method.invoke(cal1,4,5);
        System.out.println("Answer :- "+ans);
    }
}
