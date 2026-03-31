package BridgeLabz-Training.core-java-practice.gcr-codebase.programming-elements;

public class EarthVolume {
    public static void main(String[] args) {
        double radiusInKm  = 6378;      //  radius of earth in Kilometer
        double radiusInMiles = radiusInKm *0.621371;     // calculate  radius of Earth in miles
        
        double volumeInKm = (4/3)*3.14*radiusInKm*radiusInKm*radiusInKm;    // calculate volume in km^3
        double volumeInMiles = (4/3)*3.14*radiusInMiles*radiusInMiles*radiusInMiles;      // calculate volume in miles^3

        System.out.print("The volume of earth in cubic kilometer is "+volumeInKm+" cubic miles is "+volumeInMiles); // print the result
    }
}
