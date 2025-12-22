package BridgeLabz-Training.core-java-practice.gcr-codebase.strings;

import java.util.*;

public class FirstNonRepeatingCharacters {
    
    public static char firstNonRepeating(String string) {               // Method to find first non-repeating character 

        int[] freq = new int[256]; // ASCII character frequency array

        
        for (int i = 0; i < string.length(); i++) {            //Count frequency of each character
            char ch = string.charAt(i);
            freq[ch]++;
        }

        
        for (int i = 0; i < string.length(); i++) {         // Find first character with frequency 1
            char ch = string.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }

        return '0';                                     // indicates no non-repeating character
    }

   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = sc.nextLine();               // take input from user

        char result = firstNonRepeating(string);         

        if (result != '0') {
            System.out.println("First non-repeating character: " + result);        // print output
        } else {
            System.out.println("No non-repeating character found.");         // print output
     
     
        }
    }
}
