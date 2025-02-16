package regexproblems.advancedproblems.extractrepeatingwords;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatingWords {
    public void extract(String text){
        String regex= "\\b(\\w+)\\b(?:\\s+\\1\\b)+";

        Pattern pattern= Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher= pattern.matcher(text);

        Set<String> repeatedwords= new HashSet<>();

        while (matcher.find()){
            repeatedwords.add(matcher.group(1));
        }
        System.out.println(repeatedwords);
    }
}
