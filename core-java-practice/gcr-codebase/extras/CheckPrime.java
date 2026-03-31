package BridgeLabz-Training.core-java-practice.gcr-codebase.extras;
import java.util.Scanner;


public class CheckPrime {
    
    public static boolean checkPrime(int num) {            // Method to check whether a number is prime

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();        // take number from user

        boolean result = checkPrime(number);         // prime or not

        if (result) {
            System.out.println(number + " is a prime number.");     // print result
        } else {
            System.out.println(number + " is not a prime number.");   // print result
        }

      
    }
}
