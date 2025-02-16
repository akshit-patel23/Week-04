package regexproblems.advancedproblems.validatecreditcard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a credit card number");

        String cardno=sc.nextLine();

        CreditCard cc= new CreditCard();
        cc.validate(cardno);
    }
}
