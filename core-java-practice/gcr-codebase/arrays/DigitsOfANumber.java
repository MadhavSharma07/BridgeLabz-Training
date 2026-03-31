package BridgeLabz-Training.core-java-practice.gcr-codebase.arrays;

import java.util.*;

public class DigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();          // take input from user
        int maxDigit = 10;               // maximum digits 0-9
        int[] digits = new int[maxDigit];     // initialise array
        int idx = 0;                        // index counter

        while (number != 0) {
            if (idx == maxDigit) {
                break; 
            }
            digits[idx++] = number % 10;             // calculate digit 
            number /= 10;
        }
        int largestDigit = 0;
        int secondLargestDigit = 0;
        for (int i = 0; i < idx; i++) {
            if (digits[i] > largestDigit) {
                secondLargestDigit = largestDigit;
                largestDigit = digits[i];
            } else if (digits[i] > secondLargestDigit && digits[i] != largestDigit) {
                secondLargestDigit = digits[i];
            }
        }
        System.out.println("Largest digit: " + largestDigit);
        System.out.println("Second largest digit: " + secondLargestDigit);
    }
}
