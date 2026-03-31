package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;

import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();                   // take input from user
        int originalNumber = number;
        int sum = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;             // last digit of number
            sum = sum + (digit * digit * digit);     // calculate sum
            originalNumber = originalNumber / 10;           // remove last digit
        }

        if (sum == number) {
            System.out.println("Number is an Armstrong number");           // print output  - armstrong number
        } else {
            System.out.println(" Number is not an Armstrong number");  // print output - not a armstrong number
        }
    }
}
