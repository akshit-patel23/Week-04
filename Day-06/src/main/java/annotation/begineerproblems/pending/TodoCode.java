package annotation.begineerproblems.pending;

public class TodoCode {
    @Todo(task = "Development", assignedTo = "Dev")
    public void task1() {
        System.out.println("Completed!");
    }

    @Todo(task = "Designing", assignedTo = "Rahul", priority = "High")
    public void task2() {
        System.out.println("Completed!");
    }
}
