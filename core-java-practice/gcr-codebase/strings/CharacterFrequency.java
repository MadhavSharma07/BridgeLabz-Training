package BridgeLabz-Training.core-java-practice.gcr-codebase.strings;

import java.util.*;

public class CharacterFrequency {
     public static int[][] getFrequency(String string) {

        int[] count = new int[256]; // ASCII size array

        // Count frequency of each character
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            count[ch]++;
        }

        // Find number of unique characters
        int unique = 0;
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                unique++;
            }
        }

        // Store characters and frequencies in 2D array
        int[][] result = new int[unique][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                result[index][0] = i;        
                result[index][1] = count[i]; 
                index++;
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();             // take input from user

        int[][] frequency = getFrequency(input);         // store frequency in 2D array

        System.out.println("Character Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println((char) frequency[i][0] + " : " + frequency[i][1]);             // print output
        }

       
    }
}
