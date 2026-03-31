package BridgeLabz-Training.core-java-practice.gcr-codebase.java-methods;

import java.util.*;

public class Factor {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();                 // take number from user
        int[] factors = getFactors(number);           // store factors in an array
        System.out.print("Factors of " + number + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");     // print factors
        }
        System.out.println();
        int sum = factorsSum(factors);         // store factors sum  
        long product = factorsProduct(factors);      // store factors product 
        int sumSquares = factorSquareSum(factors);       // store factors square sum
        System.out.println("Sum of factors: " + sum);// print factors sum
        System.out.println("Product of factors: " + product);       // print factors product
        System.out.println("Sum of squares of factors: " + sumSquares);         // print factors square sum
    }

    public static int[] getFactors(int number) {  // Method to find factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int factorsSum(int[] factors) {            // method to find sum of factors
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static long factorsProduct(int[] factors) {      // method to find product of factors
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static int factorSquareSum(int[] factors) {       // method to find sum of factor square
        int sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }
}
