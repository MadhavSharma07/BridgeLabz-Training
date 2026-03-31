package BridgeLabz-Training.core-java-practice.gcr-codebase.strings;

import java.util.*;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();                   // take  number of sttudents input from user

        int[] studentAges = getAges(n);               // array of student's age
        String[][] votingStatus = checkVotingEligibility(studentAges);            // 2D array  which store student and its voting eligibility
        displayResult(votingStatus);                // method  that prints the result
    }

     public static int[] getAges(int n) {          // method to get ages from Random class 
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10;
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {     // method having 2D array that store student  and voting eligibility
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);
            if (age < 0) {
                result[i][1] = "false";
            } else if (age >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }


    public static void displayResult(String[][] data) {
        System.out.println("\nStudent\tAge\tCan Vote?");
        for (int i = 0; i < data.length; i++) {
            System.out.println((i + 1) + "\t" + data[i][0] + "\t" + data[i][1]);           // print result
        }
    }


}
