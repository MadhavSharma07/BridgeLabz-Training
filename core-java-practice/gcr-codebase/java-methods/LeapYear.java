package BridgeLabz-Training.core-java-practice.gcr-codebase.java-methods;

import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        System.out.print("Enter a year (≥ 1582): ");
        int year = sc.nextInt();                 // take year from user 
        if (year < 1582) {
            System.out.println("Please enter a year from 1582 onwards (Gregorian calendar).");
        } else {
            if (leapYear(year)) {
                System.out.println(year + " is a Leap Year.");  // print output 
            } else {
                System.out.println(year + " is NOT a Leap Year.");       // print output
            } 
        }
        
    }

    public static boolean leapYear(int year) {        // method to check leap year
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
}
