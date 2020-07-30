package btvalidatesodienthoai;

import baitapvalidatetencualophoc.ValidateClass;

public class ValidateNumberTelephoneTest {
    private static ValidateNumberTelphone validateNumberTelphone;
    public static final String[] numberTelephone = new String[]{"(84)-(0978489648)","(a8)-(22222222)"};


    public static void main(String[] args) {
        validateNumberTelphone = new ValidateNumberTelphone();
        for (String number: numberTelephone){
            boolean isNumber = validateNumberTelphone.validate(number);
            System.out.println("The number telephone is " + number + " is valid: " + isNumber);
        }
    }
}

