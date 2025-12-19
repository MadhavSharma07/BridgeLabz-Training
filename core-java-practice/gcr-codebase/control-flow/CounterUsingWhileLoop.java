package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;

import java.util.*;

public class CounterUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = sc.nextInt();       // take number as input from user

        while(number>0){      //  loop iterates until number is equal to zero
            System.out.println(number);
            number--;
        }
    }
}
