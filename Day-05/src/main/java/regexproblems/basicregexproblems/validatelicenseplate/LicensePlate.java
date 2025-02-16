package regexproblems.basicregexproblems.validatelicenseplate;

import java.util.regex.Pattern;

public class LicensePlate {
    public boolean validate(String PlateNumber){
        String regex="^[A-Z]{2}[0-9]{4}";
        return (Pattern.matches(regex,PlateNumber));
    }
}
