package regexproblems.advancedproblems.validateipaddress;

import java.util.regex.Pattern;

public class InternetProtocol {
    public boolean validate(String ipaddress){
        String regex= "^((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";
        return Pattern.matches(regex,ipaddress);
    }
}
