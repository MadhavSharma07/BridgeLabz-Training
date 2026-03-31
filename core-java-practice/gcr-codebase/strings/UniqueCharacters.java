package BridgeLabz-Training.core-java-practice.gcr-codebase.strings;

import java.util.Scanner;

public class UniqueCharacters {

    // Method to find length of string without using length()
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            
        }
        return count;
    }

    
    public static char[] uniqueCharacters(String string) {         // Method to find unique characters using charAt()
        int len = getLength(string);
        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char current = string.charAt(i);
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (current == string.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                temp[uniqueCount++] = current;
            }
        }

        
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = sc.nextLine();           // take string from user

        char[] uniqueChars = uniqueCharacters(string);       // array to store uniqure characters

        System.out.println("Unique characters:");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }

       
    }
}

