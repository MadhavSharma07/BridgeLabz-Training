package BridgeLabz-Training.core-java-practice.gcr-codebase.programming-elements;

import java.util.Scanner;



public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double baseInCm = sc.nextDouble();        // take base in centimeter by user
        double heightInCm = sc.nextDouble();     // takle height in centimter by user
         
        double baseInInches = baseInCm/2.54;       // convert base in centimeter to inches
        double heightInInches = heightInCm/2.54;   // convert height in centimter to inches

        double areaInCm = (0.5*baseInCm*heightInCm);  // calculate area in cm^2
        double areaInInches  = (0.5*baseInInches*heightInInches);    // calculate area in inches^2 
        
        System.out.print("The area of triangle in square cm "+areaInCm+" and in square inches "+areaInInches); // print output
    }
}
