package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;

import java.util.*;

public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = sc.nextInt();       // take number as input from user

        if(number>0){     // condition for number is positive
            System.out.print("Positive");
        }
        else if(number<0){      //condition for number is negative
            System.out.print("Negative");
        }
        else{               // condition for number is zero
            System.out.print("Zero");
        }
    }
}
