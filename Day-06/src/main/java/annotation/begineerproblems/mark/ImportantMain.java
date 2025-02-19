package annotation.begineerproblems.mark;

import java.lang.reflect.Method;

public class ImportantMain {
    public static void main(String[] args) {
     ImportantCode importantCode=new ImportantCode();
     Class<?> obj=importantCode.getClass();

     for (Method method:obj.getDeclaredMethods()){
         if(method.isAnnotationPresent(ImportantMethod.class)){
             ImportantMethod importantMethod=method.getAnnotation(ImportantMethod.class);
             System.out.println("Method: " + method.getName() + " | Level: " + importantMethod.level());

         }
     }
    }
}
