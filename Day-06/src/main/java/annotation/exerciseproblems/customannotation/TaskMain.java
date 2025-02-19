package annotation.exerciseproblems.customannotation;

import java.lang.reflect.Method;

public class TaskMain {
    public static void main(String[] args) throws NoSuchMethodException {
        Task person=new Task();
        Method method= person.getClass().getMethod("task"); //isme method ka naam hoga

        if(method.isAnnotationPresent(TaskInfo.class)){
            TaskInfo taskInfo=method.getAnnotation(TaskInfo.class);
            System.out.println("Priority :- "+taskInfo.priority());
            System.out.println("Assigned :- "+taskInfo.assigned());
        }

        person.task();

    }
}
