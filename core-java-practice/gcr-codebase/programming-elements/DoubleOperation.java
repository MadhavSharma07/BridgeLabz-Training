package BridgeLabz-Training.core-java-practice.gcr-codebase.programming-elements;

import java.util.*;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();               // take first number by user
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();               // take second number by user
        System.out.print("Enter the third number: ");
        double c = sc.nextDouble();               // take third number by user

        double operation1 = a+b*c;     // first double operation
        double operation2 = a * b + c;   // second double operation
        double operation3 = c + a/b;  //third double operation
        double operation4 = a % b +c; //fourth double operation

        System.out.print(" The results of Double Operations are "+operation1+" , "+operation2+" , "+operation3+" , and "+operation4);  // print output
    }
}
