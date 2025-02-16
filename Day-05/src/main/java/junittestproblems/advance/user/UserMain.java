package junittestproblems.advance.user;


import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner sc=new Scanner(System.in);

        System.out.print("\nEnter your Name := ");
        String name=sc.nextLine();
        System.out.print("\nEnter your Email := ");
        String email=sc.nextLine();
        System.out.print("\nEnter your Password := ");
        String password=sc.nextLine();
        try{
        UserRegistration user=new UserRegistration(name,email,password);


        }catch(IllegalArgumentException e){
            System.out.println("Error"+e.getMessage());
        }

    }
}
