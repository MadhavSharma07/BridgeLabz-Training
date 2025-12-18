package BridgeLabz

import java.util.Scanner;

-Training.core-java-practice.gcr-codebase.programming-elements;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float number1 = sc.nextFloat();     // take first number by user
        float number2 = sc.nextFloat();     // take second number by user

        float addition = number1 + number2;    // addition 
        float subtraction = number1 - number2 ; // subtraction 
        float multiplication = number1 * number2; // multiplication 
        float division  = number1/ number2;     // division
         
        System.out.print("The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and"+number2+" is"+addition+" ,"+subtraction+" ,"+multiplication+" , and"+ division);  // print the result
         
    }
}
