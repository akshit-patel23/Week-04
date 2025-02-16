package regexproblems.advancedproblems.extractcurrencyvalues;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Currency {
    public void extract(String text){
        String regex="\\$?\\d+\\.\\d{2}";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
