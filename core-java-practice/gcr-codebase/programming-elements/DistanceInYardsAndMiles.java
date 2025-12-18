package BridgeLabz-Training.core-java-practice.gcr-codebase.programming-elements;

import java.util.*;

public class DistanceInYardsAndMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanceInFeet = sc.nextDouble();      // take distance in feet from user

        double distanceInYards = distanceInFeet/3.0;        // convert distance  in feet to yards
        double distanceInMiles = distanceInYards/1760.0;   // convert distance in yards to miles

        System.out.print("The distance in yards is "+distanceInYards+" and in miles is "+distanceInMiles);  // print output
    }
}
