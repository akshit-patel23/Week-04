package exceptionhandling.uncheckedexception;

import java.util.InputMismatchException;

public class Unchecked {
    public void divide(int num1,int num2){
        try{
            int n1=num1;
            int n2=num2;
            int result=n1/n2;
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Please give a numeric input");
        }
    }
}
