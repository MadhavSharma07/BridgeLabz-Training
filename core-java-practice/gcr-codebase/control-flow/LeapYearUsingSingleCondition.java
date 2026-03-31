package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;

import java.util.*;

public class LeapYearUsingSingleCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");

        int year = sc.nextInt();      // take input from user

		if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {     //  condition for leap year
			System.out.println("Leap Year");         // print output
		} 
		else {
			System.out.println("Not a Leap Year");             // print output
		}
    }
}
