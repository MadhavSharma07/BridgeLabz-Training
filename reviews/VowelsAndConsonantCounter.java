import java.util.Scanner;

public class VowelsAndConsonantCounter {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.nextLine();

        int vowelsCounter = 0;
        int consonantsCounter = 0;

        string = string.toLowerCase(); // case-insensitive banane ke liye

        for (int i = 0; i < string.length(); i++) {

            char ch = string.charAt(i);

            
            if (ch >= 'a' && ch <= 'z') {  // alphabet check

               
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {   // vowel check
                    vowelsCounter++;
                } else {
                    consonantsCounter++;
                }
            }
        }

        System.out.println("Vowels: " + vowelsCounter);
        System.out.println("Consonants: " + consonantsCounter);
    }
}
