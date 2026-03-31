package BridgeLabz-Training.core-java-practice.gcr-codebase.programming-elements;

import java.util.*;

public class NumberOfHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       // take number of students as input by user

        int numberOfHandshakes = (n*(n-1))/2;   // calculate number of handshakes
        
        System.out.print("The maximum number of handshakes is "+numberOfHandshakes);     // print the output
    }
}
