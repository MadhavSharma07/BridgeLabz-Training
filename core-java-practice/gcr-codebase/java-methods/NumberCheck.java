package BridgeLabz-Training.core-java-practice.gcr-codebase.java-methods;

import java.util.*:

public class NumberCheck {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int[] number = new int[5];             // store numbers in array
        System.out.println("Enter 5 number:");
        for (int i = 0; i < number.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            number[i] = sc.nextInt();               // take numbers from user
        }
        for (int i = 0; i < number.length; i++) {
            int num = number[i];
            if (checkPositive(num)) {                  // check positive
                System.out.print(num + " is Positive and ");
                if (checkEven(num)) {                  // check even
                    System.out.println("Even");
                } else {                                 // check odd
                    System.out.println("Odd");
                }
            } else {
                System.out.println(num + " is Negative");
            }
        }
        int result = comparisonElement(number[0], number[4]);           // array store first and last element
        System.out.print("\nComparison of first and last element: ");     
        if (result == 1) {
            System.out.println("First number is greater than the last");
        } else if (result == -1) {
            System.out.println("First number is less than the last");
        } else {
            System.out.println("First and last numbers are equal");
        }
    }

    public static boolean checkPositive(int number) {     // method to check positive
        return number >= 0;
    }

    public static boolean checkEven(int number) {         // method to check even
        return number % 2 == 0;
    }

    public static int comparisonElement(int number1, int number2) {   // method to compare first and last element
        if (number1 > number2)
            return 1;
        else if (number1 < number2)
            return -1;
        else
            return 0;
    }
    
}

