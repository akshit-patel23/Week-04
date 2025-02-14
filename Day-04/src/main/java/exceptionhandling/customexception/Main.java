package exceptionhandling.customexception;


import java.util.Scanner;

import static exceptionhandling.customexception.ValidAge.validAge;

public class Main {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age :- ");
        int age = sc.nextInt();
        validAge(age);
    }
}
