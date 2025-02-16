package regexproblems.advancedproblems.extractcurrencyvalues;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any sentence :");
        String text= sc.nextLine();
        Currency c= new Currency();
        c.extract(text);

    }
}
