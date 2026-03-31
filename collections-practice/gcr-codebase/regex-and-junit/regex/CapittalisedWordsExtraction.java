import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CapittalisedWordsExtraction {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        String regex = "\\b[A-Z][a-z]*\\b";  // string regex

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());  // print output
        }
    }
}

