package reflection.advance.injection;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class InjectionMain {
    public static void main(String[] args) {
        Map<String, Object> dependencies=new HashMap<>();
                Injectioncode container = new Injectioncode();

                // Get Service instance with dependencies injected
        Service service = null;
        try {
            service = Injectioncode.add(Service.class,dependencies);
            service.task();
        } catch (Exception e) {
            System.out.println("Error :- "+e.getMessage());;
        }

            }
        }
