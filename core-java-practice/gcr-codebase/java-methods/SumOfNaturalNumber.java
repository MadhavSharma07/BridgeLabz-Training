package BridgeLabz-Training.core-java-practice.gcr-codebase.java-methods;

import java.util.*;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();          // take number input from user

        int sum = getSum(number);       // store sum

        System.out.println("Sum of first " + number + " natural numbers is: " + sum);   // print sum
    }

    public static int getSum(int number) {              // method to find the sum
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}

