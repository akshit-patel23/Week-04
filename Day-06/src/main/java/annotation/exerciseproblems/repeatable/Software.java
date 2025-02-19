package annotation.exerciseproblems.repeatable;

public class Software {
    @BugReport(description = "Null pointer exception when input is null")
    @BugReport(description = "Performance issue when processing large data")
    public void process() {
        System.out.println("Processing data");
    }
}
