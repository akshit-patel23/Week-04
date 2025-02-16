package regexproblems.basicregexproblems.validatelicenseplate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a License Plate Number :");
        Scanner sc= new Scanner(System.in);
        String Platenumber= sc.next();
        LicensePlate lp= new LicensePlate();
        if(lp.validate(Platenumber)){
            System.out.println("License Plate Number is Valid");
        }
        else{
            System.out.println("License Plate Number is InValid");
        }
    }
}
