package BridgeLabz-Training.core-java-practice.gcr-codebase.java-methods;

import java.util.*:

public class Chocolate {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of chocolates: ");
        int chocolates = sc.nextInt();       // take   number of chocolates input from user

        System.out.print("Enter number of children: ");
        int children = sc.nextInt();          // take number of childrens from user

        int[] ans = remainderAndQuotient(chocolates, children);        // store chocolate per student and remaining chocolate in an array

        System.out.println("Each child will get " + ans[0] + " chocolates.");   // print result
        System.out.println("Remaining chocolates: " + ans[1]);         // print result
    }

    public static int[] remainderAndQuotient(int number, int divisor) {     // method find chocolate per student and remaining chocolate
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] { quotient, remainder };
    }
}
