package regexproblems.basicregexproblems.validatehexcolor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code= sc.next();
        HexColor hx= new HexColor();
        if(hx.validate(code)){
            System.out.println("Hexcode is Valid");
        }
        else{
            System.out.println("Hexcode is Invalid");
        }
    }
}
