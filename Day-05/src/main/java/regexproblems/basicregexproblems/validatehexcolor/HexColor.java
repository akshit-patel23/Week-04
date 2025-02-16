package regexproblems.basicregexproblems.validatehexcolor;

import java.util.regex.Pattern;

public class HexColor {
    public boolean validate(String code){
        String regex="^#[0-9A-Fa-f]{6}";
       return Pattern.matches(regex,code);
    }
}
