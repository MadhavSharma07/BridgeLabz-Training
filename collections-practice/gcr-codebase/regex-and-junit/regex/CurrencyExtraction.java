import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CurrencyExtraction {
    public static void main(String[] args) {
        String string = "The price is $45.99, and the discount is 10.50.";
        String regex = "\\$?\\d+\\.\\d{2}";  // regex for currency values
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.println(matcher.group());  // print output
        }
    }
}

