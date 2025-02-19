package annotation.exerciseproblems.repeatable;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(BugReports.class)//This tells Java that multiple @BugReport annotations can be grouped under @BugReports.
@Retention(RetentionPolicy.RUNTIME)//isme runtime tak annotation ka data available rahega (Reflection se access kar sakte ho).
public @interface BugReport {
    String description();
}
@Retention(RetentionPolicy.RUNTIME)
@interface BugReports {
    BugReport[] value();  // This holds multiple BugReport annotations
}
