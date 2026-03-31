package BridgeLabz-Training.core-java-practice.gcr-codebase.java-methods;

import java.util.*;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month: ");
        int month = sc.nextInt();          // take month from user

        System.out.print("Enter day: ");
        int day = sc.nextInt();           // take day from user

        boolean checkSpring = springSeason(month, day);

        if (checkSpring) {
            System.out.println("It's a Spring Season");        // print output
        } else {
            System.out.println("Not a Spring Season");         // print output 
        }
    }

     public static boolean springSeason(int month, int day) {           // method to check spring season
        if ((month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20)) {
            return true;
        } else {
            return false;
        }
    }
}
