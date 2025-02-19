package reflection.basic.accessprivate;

import java.lang.reflect.Field;

public class PersonMain {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person p1=new Person(5);
        Class<?> cls1=p1.getClass();
        Class<? super Person>cls3=Person.class;

        Field field= cls1.getDeclaredField("age");
        field.setAccessible(true);
        field.set(p1,25);
        System.out.println("Field :- "+field.get(p1));
    }
}
