package BridgeLabz-Training.core-java-practice.gcr-codebase.java-methods;

import java.util.*;

public class NumberOfHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();                 // take number of students from user

        int numberOfHandshakes = handshakeCalculation(numberOfStudents);        // store number of handshakes 

        System.out.println("Maximum number of handshakes possible: " + numberOfHandshakes);       // print the output
    }

    public static int handshakeCalculation(int n) {          // method to find number of handshakes
        return (n * (n - 1)) / 2;
    }
}
