package BridgeLabz-Training.core-java-practice.gcr-codebase.java-methods;

import java.util.*;

public class UnitConverter {
    public static void main(String[] args) {
        System.out.println("5 yards = " + yardsToFeet(5) + " feet");         // print output
        System.out.println("10 feet = " + feetToYards(10) + " yards");
        System.out.println("2 meters = " + metersToInches(2) + " inches");
        System.out.println("50 inches = " + inchesToMeters(50) + " meters");
        System.out.println("12 inches = " + inchesToCentimeters(12) + " cm");
    }

    public static double yardsToFeet(double yards) { // method to convert yard to feet
        double yardsToFeet = 3.0;
        return yards * yardsToFeet;
    }

    public static double feetToYards(double feet) {         // method to convert feet to yard
        double feetToYards = 0.333333;
        return feet * feetToYards;
    }

    public static double metersToInches(double meters) {      // method to convert meter to inches
        double metersToInches = 39.3701;
        return meters * metersToInches;
    }

    public static double inchesToMeters(double inches) {          // method to convert inches to meter
        double inchesToMeters = 0.0254;   
        return inches * inchesToMeters;
    }

    public static double inchesToCentimeters(double inches) {   // method to convert inches to cm
        double inchesToCm = 2.54;
        return inches * inchesToCm;
    }
}
