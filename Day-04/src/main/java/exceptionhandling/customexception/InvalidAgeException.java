package exceptionhandling.customexception;

public class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }

}