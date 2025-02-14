package exceptionhandling.throwvsthrows;
import static exceptionhandling.throwvsthrows.Interest.calculate;
public class Main {
    public static void main(String[] args) {
        try{
            double interest = calculate(1000, 5, 2); // Valid input
            System.out.println("Calculated Interest: " + interest);

            double invalidInterest = calculate(-1000, 5, 2); // Invalid input
            System.out.println("Calculated Interest: " + invalidInterest);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}
