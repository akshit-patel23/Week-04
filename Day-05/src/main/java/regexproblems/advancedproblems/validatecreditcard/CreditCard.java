package regexproblems.advancedproblems.validatecreditcard;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCard {
    public void validate(String cardno){
        String regex1= "^4\\d{15}$";


        Pattern pattern1= Pattern.compile(regex1);
        Matcher matcher1= pattern1.matcher(cardno);


        String regex2= "^5\\d{15}$";


        Pattern pattern2= Pattern.compile(regex2);
        Matcher matcher2=pattern2.matcher(cardno);
        if(matcher1.find()){
            System.out.println("The given card is a valid visa card");
        }
        else if(matcher2.find()){
            System.out.println("The given card is a valid mastercard");
        }
        else{
            System.out.println("The given card no. is invalid");
        }
    }
}
