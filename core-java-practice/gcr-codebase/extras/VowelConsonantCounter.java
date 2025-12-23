package BridgeLabz-Training.core-java-practice.gcr-codebase.extras;

import java.util.*;

public class VowelConsonantCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = sc.nextLine(); // take string from user

        int vowelsCounter = 0;             // vowel counter
        int consonantsCounter = 0;         // consonant counter

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);

            
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {  // Check only alphabets

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' ||
                        ch == 'O' || ch == 'U') {

                    vowelsCounter++;
                } else {
                    consonantsCounter++;
                }
            }
        }
 
        System.out.println("Number of vowelsCounter: " + vowelsCounter);            // print vowel counter
        System.out.println("Number of consonantsCounter: " + consonantsCounter);  // print consonant counter

       
    }
}
