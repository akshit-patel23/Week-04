package basicregexproblems.validateusername;
import java.util.regex.*;
public class User {
    public boolean validate(String username){
        String regex="^[a-zA-Z][a-zA-Z0-9_]{4,14}";
        return Pattern.matches(regex,username) ;
    }
}
