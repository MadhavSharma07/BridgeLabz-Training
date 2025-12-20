package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;

import java.util.*;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");     // take input

        int number = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        if (sum > number) {
            System.out.println("Number is an Abundant Number");     // prin output
        } else {
            System.out.println(" Number is not an Abundant Number");
        }
    }
}
