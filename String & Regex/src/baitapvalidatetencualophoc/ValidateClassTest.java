package baitapvalidatetencualophoc;


public class ValidateClassTest {
        private static ValidateClass validateClass;
        public static final String[] nameClass = new String[]{"C0318G","M0318G","P0323A"};


        public static void main(String[] args) {
            validateClass = new ValidateClass();
            for (String name: nameClass){
                boolean isName = validateClass.validate(name);
                System.out.println("The name class is " + name + " is valid: " + isName);
            }
        }
    }