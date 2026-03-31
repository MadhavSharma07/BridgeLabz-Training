package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;

import java.util.*;

public class AverageMarks {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the physics marks");

        int physics = sc.nextInt();       // take physics marks from user
        System.out.println("Enter the chemistry marks");
        int chemistry = sc.nextInt();        // take chemistry  marks from user
        System.out.println("Enter the maths marks");
        int maths = sc.nextInt();         // take maths marks from user

        int total = physics + chemistry + maths;             // calculate total marks
        int average = total / 3;           // caclculate average

        System.out.println("Average Mark: " + average);

        if (average >= 80) {
            System.out.println("Grade: A");
            System.out.println("Remarks: Level 4");
        } else if (average >= 70) {
            System.out.println("Grade: B");
            System.out.println("Remarks: Level 3");
        } else if (average >= 60) {
            System.out.println("Grade: C");
            System.out.println("Remarks: Level 2");
        } else if (average >= 50) {
            System.out.println("Grade: D");
            System.out.println("Remarks: Level 1");
        } else if (average >= 40) {
            System.out.println("Grade: E");
            System.out.println("Remarks: Level 1-");
        } else {
            System.out.println("Grade: R");
            System.out.println("Remarks: Remedial");
       }
    }
}
