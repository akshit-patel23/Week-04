package exceptionhandling.exceptionpropagation;




import static exceptionhandling.exceptionpropagation.Method1Class.method1;

public class Method2Class {
    public static void  method2(){
        method1();
    }
}
