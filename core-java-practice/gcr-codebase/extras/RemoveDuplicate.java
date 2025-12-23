package BridgeLabz-Training.core-java-practice.gcr-codebase.extras;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = sc.nextLine();        // take input from user
 
        String result = "";         // result string

        
        for (int i = 0; i < string.length(); i++) {          // Loop through each character
            char current = string.charAt(i);
            boolean found = false;

            
            for (int j = 0; j < result.length(); j++) {          // Check if character already exists in result
                if (current == result.charAt(j)) {
                    found = true;
                    break;
                }
            }

            
            if (!found) {               // Add character only if not found
                result = result + current;
            }
        }

        System.out.println("String after removing duplicates: " + result);          // print output

        
    }
}
