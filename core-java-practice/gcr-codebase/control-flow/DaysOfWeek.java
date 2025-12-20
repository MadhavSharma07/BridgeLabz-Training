package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;

import java.util.*;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month");
    	int m = sc.nextInt(); //  take month from user
        System.out.println("Enter the day");
        int d = sc.nextInt(); //  take day from user 
        System.out.println("Enter the year");
        int y = sc.nextInt(); // take year from user

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        System.out.println(d0);       //  print result
    }
}
