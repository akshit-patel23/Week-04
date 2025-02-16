package regexproblems.advancedproblems.validatessn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SSN {
    public  void validate(String text){
        String regex= "\\b\\d{3}-\\d{2}-\\d{4}\\b";

        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(text);
        if(matcher.find()){
            System.out.println(matcher.group()+" is a valid SSN");

        }
        else{
            System.out.println("The given sentence doesn't have any Valid SSN");
        }
    }
}
