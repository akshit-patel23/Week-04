package regexproblems.extractionproblem.extractlinks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Links {
    public void extract(String text){
        String regex="(https|http)://(www\\.)?[a-z]+.[a-z]{3}";

        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
