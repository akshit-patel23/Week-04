package regexproblems.extractionproblem.emailaddressfromtext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtract {
    public void extract(String text){
        String regex="[a-z0-9]+@[a-z0-9]+\\.[a-z]{3}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);

        while(matcher.find()){
            System.out.println("Email :"+matcher.group());
        }

    }
}
