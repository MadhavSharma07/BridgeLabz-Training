package BridgeLabz-Training.core-java-practice.gcr-codebase.java-methods;

import java.util.*;


public class NumberCheckerThree {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();                     // take number input from user

        System.out.println("\nResults for: " + number);          // print the number
        System.out.println("Perfect Number: " + perfect(number));    // print the perfect number
        System.out.println("Abundant Number: " + abundant(number));   // print abundant number
        System.out.println("Deficient Number: " + deficient(number)); // print deficient number
        System.out.println("Strong Number: " + strongNumber(number)); // print strong number

    
    }

     public static int properDivisorsSum(int number) {        // methos to claculate sum of divisors
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean perfect(int number) {       // method to check perfect number
        return properDivisorsSum(number) == number;
    }

    public static boolean abundant(int number) {           // method to check abundant number
        return properDivisorsSum(number) > number;
    }

    public static boolean deficient(int number) {    // method to check deficient  number
        return properDivisorsSum(number) < number;
    }

    public static int factorial(int num) {               // method to calculate factorial
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean strongNumber(int number) {                // method to check strong number
        int original = number;                               
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        return sum == original;
    }
}

