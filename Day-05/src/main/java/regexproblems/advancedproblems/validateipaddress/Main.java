package regexproblems.advancedproblems.validateipaddress;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String ipaddress=sc.nextLine();

        InternetProtocol ip= new InternetProtocol();
        if(ip.validate(ipaddress)){
            System.out.println("The given ip is valid");
        }
        else{
            System.out.println("The given ip is invalid");
        }

    }
}
