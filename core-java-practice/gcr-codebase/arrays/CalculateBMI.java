package BridgeLabz-Training.core-java-practice.gcr-codebase.arrays;

import java.util.*;

public class CalculateBMI {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();                    // take number of person from user
        double[] weight = new double[n];             // weight array
        double[] height = new double[n];      //  height array
        double[] bmi = new double[n];            // bmi array
        String[] status = new String[n];           // weight status array
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of Person " + (i + 1) + ":");

            System.out.print("Enter weight (kg): ");
            weight[i] = sc.nextDouble();            // take weight of perosn from user
            while (weight[i] <= 0) {
                System.out.print(" Enter  valid positive weight: ");
                weight[i] = sc.nextDouble();
            }

            System.out.print("Enter height (m): ");
            height[i] = sc.nextDouble();          // take height of person from user
            while (height[i] <= 0) {
                System.out.print(" Enter valid positive height: ");
                height[i] = sc.nextDouble();
            }

            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] <= 18.4)
                status[i] = "Underweight";
            else if (bmi[i] <= 24.9)
                status[i] = "Normal";
            else if (bmi[i] <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }
        System.out.println(" BMI Report");
        for (int i = 0; i < n; i++) {
            System.out.println("Person :"+ (i + 1));
            System.out.println("Weight: %.2f kg"+ weight[i]);
            System.out.println("Height: %.2f m"+ height[i]);
            System.out.println("BMI: %.2f"+ bmi[i]);
            System.out.println("  Status: " + status[i]);
            
        }
    }
}
