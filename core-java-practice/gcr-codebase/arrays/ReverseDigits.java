package BridgeLabz-Training.core-java-practice.gcr-codebase.arrays;

import java.util.*;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();        // take input from user
        int count = 0;                   // didits counter
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        int[] digits = new int[count];        // digits array
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        int[] reversedDigits = new int[count];     // reverse digits array
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }
        System.out.print("Reversed digits: ");
        for (int digit : reversedDigits) {
            System.out.print(digit + " ");        // print the result
        }
    }
}
