package BridgeLabz-Training.core-java-practice.gcr-codebase.java-methods;

import java.util.*;

public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();            // take number from user
        int result = checkNumber(number);    // store result
        if (result == 1) {
            System.out.println("The number is positive.");   // print output if number is positive
        } else if (result == -1) {
            System.out.println("The number is negative.");    // print output if number is negative
        } else {
            System.out.println("The number is zero.");        // print output if number is zero
        }
    }

    public static int checkNumber(int number) {       // method to find number is positive , negative or zero
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
