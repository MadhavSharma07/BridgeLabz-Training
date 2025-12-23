package BridgeLabz-Training.core-java-practice.gcr-codebase.extras;

import java.util.*;

public class FrequentCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = sc.nextLine();      // take string from user

        int[] freq = new int[256]; // ASCII size array

        
        for (int i = 0; i < string.length(); i++) {       // Count frequency of each character
            char ch = string.charAt(i);
            freq[ch]++;
        }

        char mostFrequent = string.charAt(0);
        int maxCount = freq[mostFrequent];

        
        for (int i = 1; i < string.length(); i++) {        // Find character with highest frequency
            char ch = string.charAt(i);
            if (freq[ch] > maxCount) {
                maxCount = freq[ch];
                mostFrequent = ch;
            }
        }

        System.out.println("Most frequent character: " + mostFrequent);      // print output
        System.out.println("Frequency: " + maxCount);

        
    }
}
