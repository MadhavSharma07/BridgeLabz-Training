import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailExtraction {
    public static void main(String[] args) {
        String string = "Contact us at support@example.com and info@company.org";  
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";  // regex for Email address

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println(matcher.group());  // print output
        }
    }
}
