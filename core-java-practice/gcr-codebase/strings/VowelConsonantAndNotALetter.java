package BridgeLabz-Training.core-java-practice.gcr-codebase.strings;

import java.util.*;

public class VowelConsonantAndNotALetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.nextLine();            // take string input from user
        String[][] result = analyzeString(string);        // 2D array that stores character and its type
        displayResult(result);
    }


    public static String characterType(char ch) {             // method to get characater type
        ch = Character.toLowerCase(ch);                // change character to lower case 
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } 
        else {
            return "Not a Letter";
        }
    }

    public static String[][] analyzeString(String input) {           // method to store character and its type in 2D array 
        int n = input.length();
        String[][] result = new String[n][2];
        for (int i = 0; i < n; i++) {
            char ch = input.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = characterType(ch);
        }
        return result;
    }


    public static void displayResult(String[][] data) {         // method to print the result
        System.out.println("\nCharacter\tType");
        
        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + row[1]);     // print the output
        }
    }
}
