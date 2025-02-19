package reflection.advance.objectmapper;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import static reflection.advance.objectmapper.ObjectMapping.toObject;

public class ObjectMain {
    public static void main(String[] args) throws NoSuchFieldException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
Map<String,Object> properties= Map.of(
        "name", "Dev",
        "age", 28
);

Person person=toObject(Person.class,properties); //trying to copy value of map in object
        System.out.println(person);
    }
}
