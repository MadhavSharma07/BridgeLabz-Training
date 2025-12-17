package BridgeLabz-Training.core-java-practice.gcr-codebase.programming-elements;

import java.util.*;

public class CelciusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in celcius:");
        double celcius = sc.nextInt(); // take input temperature in celcius from user

        double fahrenheit = 0;           // store temperature in fahrenheit
        fahrenheit = (celcius + 9/5) + 32;        // conversion of celcius to fahrenheit
        System.out.print("Temperture in fahrenheit:"+fahrenheit);          // print temperature in fahrenheit

    }
}
