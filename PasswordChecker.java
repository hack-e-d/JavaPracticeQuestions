public class PasswordChecker {
    public static void main(String a[]) {
        String password = "Meera12dw@password";
        System.out.println(new PasswordChecker().isPasswordValid(password));
    }

    public boolean isPasswordValid(String password) {
        Boolean numberPresent = false, capitalPresent = false, pmPresent = false, lengthFlag = false, pwdFlag = false;
        if(password.contains("password")) {
            pwdFlag = false;
        }
        else {
            pwdFlag = true;
        }
        if(password.length()>7 && password.length()<31) {
            lengthFlag = true;
        }
        else {
            lengthFlag = false;
        }
        for (int i =0;i<password.length();i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                capitalPresent = true;
            }
            if (!Character.isLetter(password.charAt(i)) && !Character.isDigit(password.charAt(i))) {
                pmPresent = true;
            }
            if (Character.isDigit(password.charAt(i))) {
                numberPresent = true;
            }
        }
        return lengthFlag && pwdFlag && numberPresent && capitalPresent && pmPresent;
    }
}
