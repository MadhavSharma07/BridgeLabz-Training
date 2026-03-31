import java.util.*;
import java.util.regex.*;

public class ValidateUsername {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();  // take username from user

        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";  // regex for username

        Pattern pattern = Pattern.compile(regex);  
        Matcher matcher = pattern.matcher(username);

        if (matcher.matches()) {  // match regex with username
            System.out.println("Valid Username");  // print output
        } else {
            System.out.println("Invalid Username");
        }


        
    }
}


