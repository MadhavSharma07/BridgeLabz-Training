package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;

import java.util.*;

public class HarshadNumber {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");   // take input
        int number = sc.nextInt();
        int temp = number;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        if (number % sum == 0) {
            System.out.println("Number is a Harshad Number");          // print output
        } else {
            System.out.println("Number is not a Harshad Number");
        }
}
