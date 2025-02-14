package exceptionhandling.customexception;

public class ValidAge {
    public static void validAge(int age) throws InvalidAgeException{

        if(age<18){
            throw new InvalidAgeException("You are not Eligible");

        }
        System.out.println("Assess granted!");

    }
}