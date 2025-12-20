package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;

import java.util.*;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();                   // take input from user

        int originalNumber = number;
        int numberOfDigits=0;

         while (originalNumber != 0) {
            int digit = originalNumber % 10;             // last digit of number
            numberOfDigits++;                               // increase the counter
            originalNumber = originalNumber / 10;           // remove last digit
        }

        System.out.println("The number of digits is: "+numberOfDigits); // print output
    }
}
