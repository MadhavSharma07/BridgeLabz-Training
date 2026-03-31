package BridgeLabz-Training.core-java-practice.gcr-codebase.strings;

import java.util.*;

public class PalindromeCheck {

    
    public static boolean palindromeIterative(String string) {         // logic 1- Using start and end index (iterative)
        int start = 0;
        int end = string.length() - 1;

        while (start < end) {
            if (string.charAt(start) != string.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    /
    public static boolean palindromeRecursive(String text, int start, int end) {        // logic 2- Using recursion
        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return palindromeRecursive(text, start + 1, end - 1);
    }

    
    public static char[] reverseString(String text) {             // Method to reverse string using charAt()
        int len = text.length();
        char[] reverse = new char[len];

        for (int i = 0; i < len; i++) {
            reverse[i] = text.charAt(len - 1 - i);
        }
        return reverse;
    }

   
    public static boolean palindromeUsingArray(String text) {           // logic 3 -Using character arrays
        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String string = sc.nextLine();  // take string from user

        System.out.println("\nPalindrome Check Results:");

        System.out.println("Logic 1 (Iterative): " +
                palindromeIterative(string));             // print output palindrome iterative

        System.out.println("Logic 2 (Recursive): " +
                palindromeRecursive(string, 0, string.length() - 1));              // print  output  plaindrome recursive

        System.out.println("Logic 3 (Character Array): " +
                palindromeUsingArray(string));                   // print output  palindrome using arrays

        
    }
}

