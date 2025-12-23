package BridgeLabz-Training.core-java-practice.gcr-codebase.java-methods;

import java.util.*;

public class NumberCheckerFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int number = sc.nextInt();            // take input from user

        System.out.println("Prime number? " + checkPrime(number));      // print output
        System.out.println("Neon number? " + checkNeon(number));
        System.out.println("Spy number? " + checkSpy(number));
        System.out.println("Automorphic number? " + checkAutomorphic(number));
        System.out.println("Buzz number? " + checkBuzz(number));

        
    }

     public static boolean checkPrime(int n) {     // method to check prime
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean checkNeon(int n) {       // method to check neon
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }

    public static boolean checkSpy(int n) {       // method to check spy
        int sum = 0, product = 1, temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    public static boolean checkAutomorphic(int n) {     // method to check automorphic
        int square = n * n;
        String nStr = String.valueOf(n);
        String sqStr = String.valueOf(square);
        return sqStr.endsWith(nStr);
    }

    public static boolean checkBuzz(int n) {               // method to check buzz
        return (n % 7 == 0 || n % 10 == 7);
    }

}
