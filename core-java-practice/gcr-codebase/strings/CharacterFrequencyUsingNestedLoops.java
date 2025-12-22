package BridgeLabz-Training.core-java-practice.gcr-codebase.strings;


import java.util.*;

public class CharacterFrequencyUsingNestedLoops {
     public static String[] findFrequency(String string) {

        char[] charArray = string.toCharArray();
        int[] freq = new int[charArray.length];

        
        for (int i = 0; i < charArray.length; i++) {                //  Initialize frequency
            freq[i] = 1;
        }

        
        for (int i = 0; i < charArray.length; i++) {                 // Find frequency using nested loops
            if (charArray[i] == '0') {
                continue;
            }

            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    freq[i]++;
                    charArray[j] = '0'; // mark duplicate
                }
            }
        }

       
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {                  // Count unique characters
            if (charArray[i] != '0') {
                count++;
            }
        }

        
        String[] result = new String[count];                    //  Store result in String array
        int index = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != '0') {
                result[index] = charArray[i] + " : " + freq[i];
                index++;
            }
        }

        return result;
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = sc.nextLine();           // take input from user

        String[] output = findFrequency(string);      // store result in array

        System.out.println("Character Frequency:");
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);       // pritnt output
        }

        
    }
}
