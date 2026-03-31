package BridgeLabz-Training.core-java-practice.gcr-codebase.extras;


import java.util.*;
public class CheckPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = sc.nextLine();     // take input from user

        boolean palindrome = true;
        int start = 0;
        int end = string.length() - 1;

        
        while (start < end) {
            if (string.charAt(start) != string.charAt(end)) {         // Compare characters from start and end
                palindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (palindrome) {
            System.out.println("The string is a palindrome.");           // print result 
        } else {
            System.out.println("The string is not a palindrome.");   // print result
        }

        
    }
}
