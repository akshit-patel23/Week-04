package junittestproblems.basic.calculator;
import static junittestproblems.basic.calculator.Calculator.*;
import static junittestproblems.basic.exceptionhandling.Divide.divide;

public class CalculatorMain {
    public static void main(String[] args) {
        int a=4,b=2;
        System.out.println("Add "+add(a,b));
        System.out.println("Subtract "+subtract(a,b));
        System.out.println("Multiply "+multiply(a,b));
        try{
            System.out.println("Divide "+divide(a,b));}
        catch (ArithmeticException e){
            System.out.println("Error "+e.getMessage());
        }

    }
}
