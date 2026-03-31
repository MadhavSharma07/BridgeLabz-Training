package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;

import java.util.*;

public class CalculatorUsingSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");  // take input from user
        double number1 = sc.nextDouble();
        System.out.println("Enter the second number"); // take second number from user
        double number2 = sc.nextDouble();
        String operation = sc.next();

        switch (operation) {
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "*":
                System.out.println(number1 * number2);
                break;
            case "/":
                System.out.println(number1 / number2);
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
