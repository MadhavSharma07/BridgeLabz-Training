package BridgeLabz-Training.core-java-practice.gcr-codebase.programming-elements;

import java.util.*;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base:");        
        double base = sc.nextDouble();       // take input base from user
        System.out.print("Enter the exponent:");
        double exponent= sc.nextDouble();         // take input exponent from user

        double result = Math.pow(exponent,base);  // calculate the result
        System.out.print("The result is:"+result);    // print the result
    }
}
