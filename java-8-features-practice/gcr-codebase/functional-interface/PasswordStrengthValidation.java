package functional_interface;

interface SecurityUtils{  // interface Password Validation

    static boolean passwordStrength(String password) {  // static method

        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else hasSpecial = true;
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}


public class PasswordStrengthValidation {  // main class

	public static void main(String[] args) {
		  String password = "Secure@123";

	        if (SecurityUtils.passwordStrength(password)) {
	            System.out.println("Password is strong");  // print output
	        } else {
	            System.out.println("Weak password");
	        }

	}

}
