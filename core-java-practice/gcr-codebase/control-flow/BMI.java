package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;

import java.util.*;

public class BMI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight(in kg)");
        double weight = sc.nextDouble();                   // take weight input from user
        System.out.println("Enter the height (in cm)");
        double height = sc.nextDouble();                // take  height input form user

        double bmi = weight/(height*height);      // calculate BMI 

        if(bmi<=18.4){
            System.out.println("Underweight");
        }
        else if(bmi>=18.5 && bmi<=24.9){
            System.out.println("Normal");
        }
        else if(bmi>=25.0 && bmi <=39.9){
            System.out.println("Overweight");
        }
        else if(bmi>=40.0){
            System.out.println("Obese");
        }

        

    }
}
