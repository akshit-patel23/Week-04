package annotation.begineerproblems.pending;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
public @interface Todo {
    String task() ;
     String assignedTo();
     String priority() default "MEDIUM";
}
