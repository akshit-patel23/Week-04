package regexproblems.advancedproblems.extractrepeatingwords;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any Sentence :");
        String text= sc.nextLine();
        RepeatingWords rw= new RepeatingWords();
        rw.extract(text);
    }
}
