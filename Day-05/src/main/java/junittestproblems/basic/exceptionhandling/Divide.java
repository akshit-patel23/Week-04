package junittestproblems.basic.exceptionhandling;

public class Divide {
    public static int divide(int a, int b){
        if(b==0){
            throw new ArithmeticException("Number is divided by zero");
        }
        else {
            return a/b;
        }
    }
}
