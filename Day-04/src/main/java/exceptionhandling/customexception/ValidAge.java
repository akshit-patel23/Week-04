package exceptionhandling.customexception;

public class ValidAge {
    public static void validAge(int age) throws InvalidAgeException{

        if(age<18){
            throw new InvalidAgeException("You are not Eligible");

        }
        System.out.println("Assess granted!");

    }
    //without extending
    public static void valid(int age){
        try {
            if (age < 18) {
                throw new Exception("Age must be 18 or above");
            }
            System.out.println("Access granted!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}