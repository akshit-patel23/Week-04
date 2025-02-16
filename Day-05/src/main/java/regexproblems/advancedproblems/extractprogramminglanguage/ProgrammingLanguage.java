package regexproblems.advancedproblems.extractprogramminglanguage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgrammingLanguage {
    public void extract(String text){
        String [] languages={"javascript","python","java","c++","c"};

       String regex="\\b(" + String.join("|", languages) + ")\\b";

       Pattern  pattern= Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
       Matcher matcher= pattern.matcher(text);

       while(matcher.find()){
           System.out.println(matcher.group());

       }
    }
}
