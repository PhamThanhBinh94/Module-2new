package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComparaString {
    public static void main(String[] args) {
//        String content = "01-10-2020";
        String content = "Chau";
//        Pattern pattern = Pattern.compile("\\d{2}[/|-]\\\\d{2}[/|-]\\d{4}");
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9\\s]+$");
        Matcher matcher = pattern.matcher(content);
        System.out.println(matcher.matches());
    }
}
