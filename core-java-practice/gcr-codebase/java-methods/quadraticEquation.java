package BridgeLabz-Training.core-java-practice.gcr-codebase.java-methods;

import java.util.*;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();            // take input a from user
        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();           // take input b from user
        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();            // take input c from user
        double[] roots = getRoots(a, b, c);           // store roots in array
        if (roots.length == 2) {
            System.out.println("Two real roots: x1 = " + roots[0] + ", x2 = " + roots[1]);    // print output
        } else if (roots.length == 1) {
            System.out.println("One real root: x = " + roots[0]);       // print output
        } else {
            System.out.println("No real roots.");    // print output
        }

        
    }

    public static double[] getRoots(double a, double b, double c) {        // method to find roots 
        double ans = Math.pow(b, 2) - 4 * a * c;

        if (ans > 0) {
            double root1 = (-b + Math.sqrt(ans)) / (2 * a);
            double root2 = (-b - Math.sqrt(ans)) / (2 * a);
            return new double[] { root1, root2 };
        } else if (ans == 0) {
            double root = -b / (2 * a);
            return new double[] { root };
        } else {
            return new double[] {};
        }
    }


}
