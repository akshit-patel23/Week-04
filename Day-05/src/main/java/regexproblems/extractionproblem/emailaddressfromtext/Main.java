package regexproblems.extractionproblem.emailaddressfromtext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String text="Contact us at support@example.com and info@company.org";
        EmailExtract ex= new EmailExtract();
        ex.extract(text);
    }
}
