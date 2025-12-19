package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;

import java.util.*;

public class CounterUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = sc.nextInt(); // take number as input from user

        for (int i = number; i > 0; i--) {       // loop iterates until number is greater than zero
            System.out.println(number); // print the counter
        }

    }
}
