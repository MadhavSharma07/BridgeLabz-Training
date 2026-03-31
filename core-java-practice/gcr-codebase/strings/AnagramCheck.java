package BridgeLabz-Training.core-java-practice.gcr-codebase.strings;

import java.util.*;

public class AnagramCheck {

    
    public static boolean anagram(String string1, String string2) {              // Method to check anagram

        
        if (string1.length() != string2.length()) {               //  Check length
            return false;
        }

        
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        
        for (int i = 0; i < string1.length(); i++) {                //  Find frequency of characters
            char ch1 = string1.charAt(i);
            char ch2 = string2.charAt(i);

            freq1[ch1]++;
            freq2[ch2]++;
        }

        
        for (int i = 0; i < 256; i++) {                    //  Compare frequencies
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String string1 = sc.nextLine();          // take string1 input from user

        System.out.print("Enter second text: ");
        String string2 = sc.nextLine();          // take string2 input from user

        boolean result = anagram(string1, string2);            // store result

        if (result) {
            System.out.println("The strings are anagrams.");     //  print output
        } else {
            System.out.println("The strings are not anagrams."); // print output
        }


    }
}

