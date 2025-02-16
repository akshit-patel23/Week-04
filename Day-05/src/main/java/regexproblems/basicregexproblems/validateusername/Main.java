package regexproblems.basicregexproblems.validateusername;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a username :");
        Scanner sc= new Scanner(System.in);
        String username= sc.next();
        User u= new User();

        if(u.validate(username)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }

    }
}
