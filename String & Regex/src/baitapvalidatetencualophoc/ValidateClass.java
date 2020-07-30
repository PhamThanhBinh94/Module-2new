package baitapvalidatetencualophoc;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass{
    private static final String ACCOUNT_REGEX = "^[C|A|P][0-9]{4}[G-M]$";

    public ValidateClass(){
    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
