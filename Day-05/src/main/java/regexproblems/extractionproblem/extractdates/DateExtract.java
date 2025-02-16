package regexproblems.extractionproblem.extractdates;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExtract {
    public void extract(String text){
        String regex= "[0-9]{2}/[0-9]{2}/[0-9]{4}";

        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
