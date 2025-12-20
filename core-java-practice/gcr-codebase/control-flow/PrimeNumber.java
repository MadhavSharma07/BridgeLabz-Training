package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = sc.nextInt();       // take number as input from user

        boolean prime = true;

        if (number <= 1) {
            prime = false;
        } 
        else {
            for (int i = 2; i < number; i++) {         // find number is prime or not
                if (number % i == 0) {
                    prime = false;
                    break;              // break the loop
                }
            }
        }

        if (prime) {
            System.out.println("Number is a prime number.");           // print output - prime number
        } else {
            System.out.println("Number is not a prime number.");        // print output- not a prime
        }




    }
}
