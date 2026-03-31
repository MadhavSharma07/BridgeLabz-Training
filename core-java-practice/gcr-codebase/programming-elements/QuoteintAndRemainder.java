package BridgeLabz-Training.core-java-practice.gcr-codebase.programming-elements;

import java.util.*;

public class QuoteintAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();               // take first number by user
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();    // take second number by user


        int quoteint = number1/number2;
        int remainder = number1 % number2 ;
        
        System.out.print("The Quotient is "+quoteint+" and Reminder is "+remainder+" of two number "+number1+ " and"+number2);  // print output
    }
}
