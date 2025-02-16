package regexproblems.advancedproblems.validatessn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String text=sc.nextLine();
        SSN ssn= new SSN();
        ssn.validate(text);
    }
}
