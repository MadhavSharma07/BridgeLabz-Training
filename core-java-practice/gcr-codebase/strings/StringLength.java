package BridgeLabz-Training.core-java-practice.gcr-codebase.strings;

import java.util.*;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.next();              // take input from user
        int userLength = findLength(string);          // find user length by user defined method
        int builtInLength = string.length();     // find length using built-in function

        System.out.println("\nLength using user method: " + userLength);
        System.out.println("Length using built-in method: " + builtInLength);
    }


    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
        return count;
    }
}
