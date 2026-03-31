package BridgeLabz-Training.core-java-practice.gcr-codebase.programming-elements;


 import java.util.*;
public class CmToFeetAndInches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double heightInCm = sc.nextDouble();     // take input  height from user in centimeter

        double heightInInches = heightInCm/2.54;      // calculate height in inches
        double heightInFeet = heightInInches/12;         // calculateheight in foot
        
        System.out.print("Your height in cm is "+heightInCm+" while in feet is "+heightInFeet+" and inches is "+heightInInches); // print the result
    }
}
