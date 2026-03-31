package BridgeLabz-Training.core-java-practice.gcr-codebase.extras;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = sc.nextLine();    // take string input from user

        String reversed = "";

        
        for (int i = string.length() - 1; i >= 0; i--) {         // Loop from end to start
            reversed = reversed + string.charAt(i);      // reverse string
        }

        System.out.println("Reversed string: " + reversed);    // print reverse string

    
    }
}
