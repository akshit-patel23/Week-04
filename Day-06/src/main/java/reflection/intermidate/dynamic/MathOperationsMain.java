package reflection.intermidate.dynamic;

import reflection.basic.invokeprivate.Calculator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class MathOperationsMain {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name of class :- ");
        String name=sc.nextLine().trim();
        String path = "reflection.intermidate.dynamic." + name;
        System.out.print("Enter the operation(+,-,*) :- ");
        String op=sc.nextLine();
        System.out.print("\nEnter the number :- ");
        int a=sc.nextInt();
        System.out.print("\nEnter the number :- ");
        int b=sc.nextInt();

        Class<?> classObj=Class.forName(path);
        Object obj=classObj.getDeclaredConstructor().newInstance();
        switch(op) {
            case "+":
                Method method1=classObj.getDeclaredMethod("add",int.class,int.class);
                int result1=(int) method1.invoke(obj,a,b);
                System.out.println("The addition of numbers :- "+result1);
                break;
            case "-":
                Method method2=classObj.getDeclaredMethod("subtract",int.class,int.class);
                int result2=(int) method2.invoke(obj,a,b);
                System.out.println("The subtraction of numbers :- "+result2);
                break;
            case "*":
                Method method3=classObj.getDeclaredMethod("multiply",int.class,int.class);
                int result3=(int) method3.invoke(obj,a,b);
                System.out.println("The multiplication of numbers :- "+result3);
                break;

        }

    }
}
