package regexproblems.advancedproblems.extractprogramminglanguage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String text =sc.nextLine();
        ProgrammingLanguage pl= new ProgrammingLanguage();
        pl.extract(text);

    }
}
