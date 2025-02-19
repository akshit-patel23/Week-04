package reflection.intermidate.retrieve;

import java.lang.reflect.Method;

public class BookMain {
    public static void main(String[] args) throws NoSuchMethodException {
   Book b1=new Book();
   Class<?> obj=b1.getClass();
        Method[] method = obj.getDeclaredMethods();
        for(Method method1:method){
            if(method1.isAnnotationPresent(Author.class)){
                Author obj1=method1.getAnnotation(Author.class);
                System.out.println("Name of Author is "+obj1.name());
            }
        }


    }
}
