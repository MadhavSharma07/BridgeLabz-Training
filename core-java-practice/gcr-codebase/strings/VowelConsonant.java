package BridgeLabz-Training.core-java-practice.gcr-codebase.strings;

import java.util.*;

public class VowelConsonant {
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.nextLine();            // take user input

        int[] result = vowelsConsonantsCounter(string);          // store vowels and consonants counts in array
        System.out.println("\nTotal Vowels: " + result[0]);      // print output
        System.out.println("Total Consonants: " + result[1]);

    }

    public static String getCharacterType(char ch) {              // method to find that character is vowel or consonant
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    public static int[] vowelsConsonantsCounter(String str) {        // method to count vowels and consonants
        int vowels = 0, consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String characterType = getCharacterType(ch);
            if (characterType.equals("Vowel")) {
                vowels++;
            } else if (characterType.equals("Consonant")) {
                consonants++;
            }
        }
    }
}
