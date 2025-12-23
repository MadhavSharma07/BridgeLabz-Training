package BridgeLabz-Training.core-java-practice.gcr-codebase.extras;


import java.util.*;
public class FactorialUsingRecursion {
    
    
    public static int getInput() {        // Method to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        return num;
    }

    /
    public static long factorialUsingRecursion(int n) {   // Recursive method to calculate factorialUsingRecursion
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialUsingRecursion(n - 1);
    }

    
    public static void displayResult(int number, long result) {         // Method to display output
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static void main(String[] args) {

        int number = getInput();           // take input from user 
        long result = factorialUsingRecursion(number);      // store factorial 
        displayResult(number, result);          // print result
    }
}

