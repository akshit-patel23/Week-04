package junittestproblems.basic.performancetesting;

public class TimeOutClass {
    public static String task() throws InterruptedException {
        Thread.sleep(3000);
        return "Task Completed";
    }
}
