package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;

import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();            // take year as input from user


        if (year < 1582) {
			System.out.println("Not a Leap Year");
		} 
		else if (year % 400 == 0) {
			System.out.println("Leap Year");
		} 
		else if (year % 100 == 0) {
			System.out.println("Not a Leap Year");
		} 
		else if (year % 4 == 0) {
			System.out.println("Leap Year");
		} 
		else {
			System.out.println("Not a Leap Year");
		}

    }
}
