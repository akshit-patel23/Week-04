package regexproblems.replaceandmodify.censorbadwords;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String text= sc.nextLine();
        BadWords bw= new BadWords();
        bw.Censor(text);
    }
}
