package btvalidatesodienthoai;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ValidateNumberTelphone{
    private static final String ACCOUNT_REGEX = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";

    public ValidateNumberTelphone(){
    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
