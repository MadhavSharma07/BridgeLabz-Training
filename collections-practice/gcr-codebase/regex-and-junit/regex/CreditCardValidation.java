import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CreditCardValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter card number: ");
        String cardNumber = sc.nextLine();// take number from user
        String regex = "^(4|5)[0-9]{15}$";  // regex for valid credit card number
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cardNumber);

        if (matcher.matches()) {
            System.out.println("Valid Credit Card Number");// print output
        } else {
            System.out.println("Invalid Credit Card Number");
        }

    }
}

