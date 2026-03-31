package BridgeLabz-Training.core-java-practice.gcr-codebase.programming-elements;

import java.util.*;

public class SideOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double perimeter  = sc.nextDouble() ;  // take perimeter as input 
        double side = perimeter/4;         // calculate side of square

        System.out.print(" The length of the side is "+side+" whose perimeter is "+perimeter);   //  print output


    }
}
