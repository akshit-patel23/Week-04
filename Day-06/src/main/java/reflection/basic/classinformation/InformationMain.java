package reflection.basic.classinformation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class InformationMain {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name of class :- ");
        String className=sc.nextLine();
       String path="reflection.basic.classinformation."+className;
        Class<?> cls1=Class.forName(path);
        Method[] methods=cls1.getDeclaredMethods();

        Constructor<?> constructor=cls1.getConstructor(String.class);
        Field field= cls1.getDeclaredField("name");
        field.setAccessible(true);
        System.out.println("\nField :- "+field);
        for(Method method:methods){
            System.out.println("Method :- "+method.getName());
        }
        System.out.println("Constructor :- "+constructor);
    }
}
