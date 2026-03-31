import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SSNValidation {
    public static void main(String[] args) {
        String string = "My SSN is 123-45-6789.";
        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";  // regex for valid SSN 
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            System.out.println(" SSN is valid");  // print output
        } else {
            System.out.println("SSN is invalid");
        }
    }
}

