import java.util.Scanner;

public class Fibonacci {

    
    public static void fibonacciResult(int terms) {    // Method to calculate and print Fibonacci sequence

        int firstTerm = 0;
        int secondTerm = 1;

        if (terms <= 0) {               // user enter invalid terms
            System.out.println("Please enter a positive number.");
            return;
        }

        System.out.print("Fibonacci sequence: ");

        for (int i = 1; i <= terms; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();          // take terms from user

        fibonacciResult(n);         // print result

        
    }
}
