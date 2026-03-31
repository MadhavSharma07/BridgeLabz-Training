import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidateLicensePlateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter license licenseNumber number: ");
        String licenseNumber = sc.nextLine();  // take license number from user
        String regex = "^[A-Z]{2}[0-9]{4}$";   // regex for valid license number

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(licenseNumber);

        if (matcher.matches()) {
            System.out.println("Valid License Plate");   // print output
        } else {
            System.out.println("Invalid License Plate");
        }

    }
}

