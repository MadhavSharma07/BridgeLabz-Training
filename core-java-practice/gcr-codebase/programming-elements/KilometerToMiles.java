package BridgeLabz-Training.core-java-practice.gcr-codebase.programming-elements;
import java.util.*;

public class KilometerToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in kilometer:");
        double km = sc.nextDouble(); // take input distance in kilometer from user

        double miles = km*0.621371;  // calculate distance in miles

        System.out.print("The distance in miles is:"+miles);   // print the distance in miles
    }
}
