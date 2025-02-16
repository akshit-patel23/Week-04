package junittestproblems.basic.exceptionhandling;

import static junittestproblems.basic.calculator.Calculator.*;
import static junittestproblems.basic.exceptionhandling.Divide.divide;

public class DivideMain {
    public static void main(String[] args) {
        int a=4,b=2;
        try{
       System.out.println("Divide "+divide(a,b));}
        catch (ArithmeticException e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
