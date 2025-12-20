package BridgeLabz-Training.core-java-practice.gcr-codebase.arrays;

import java.util.*;

public class EvenOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();            // take input from user

    
        int[] oddArray = new int[(number/2)+1];          // initialise odd array
        int[] evenArray = new int[(number/2)];           // initialise even array
        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {          // even elements
                evenArray[oddIndex++] = i;
            } else {              // odd elements
                oddArray[evenIndex++] = i;
            }
        }

        System.out.println("Odd numbers are :");
        for (int i = 0; i < oddArray.length; i++) {          // print odd numbers
            System.out.print(oddArray[i] + " ");
        }

        System.out.println("Even numbers are :");
        for (int i = 0; i < evenArray.length; i++) {        // print even numbers 
            System.out.print(evenArray[i] + " ");
        }
    }
}
