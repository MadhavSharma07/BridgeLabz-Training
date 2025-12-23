package BridgeLabz-Training.core-java-practice.gcr-codebase.extras;

import java.util.*;

public class RemoveSpecificCharacter {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = sc.nextLine();

        System.out.print("Enter the character to remove: ");
        char removeChar = sc.next().charAt(0);

        String result = "";

        
        for (int i = 0; i < string.length(); i++) {        // Loop through string and skip the given character
            if (string.charAt(i) != removeChar) {
                result = result + string.charAt(i);
            }
        }

        System.out.println("String after removing '" + removeChar + "': " + result); // print output

        
    }
}
