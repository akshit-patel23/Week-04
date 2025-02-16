package regexproblems.extractionproblem.capitalwordsinsentence;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalWord {
    public void capital(String text){
        String regex="[A-Z][a-zA-Z]+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher= pattern.matcher(text);

        while(matcher.find()){
            System.out.print(matcher.group()+" ");
        }
    }
}
