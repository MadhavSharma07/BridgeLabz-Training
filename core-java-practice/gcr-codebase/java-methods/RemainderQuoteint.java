package BridgeLabz-Training.core-java-practice.gcr-codebase.java-methods;

import java.util.*;

public class RemainderQuoteint {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = sc.nextInt();              // take number from user

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();          // take divisor fom user

        int[] result = getRemainderAndQuotient(number, divisor);      // store quoteint and remainder in an array

        System.out.println("Quotient: " + result[0]);     // print quoteint
        System.out.println("Remainder: " + result[1]);       // print remainder
    }

    public static int[] getRemainderAndQuotient(int number, int divisor) {             // method to find quoteint and remainder
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] { quotient, remainder };
    }

    
}

