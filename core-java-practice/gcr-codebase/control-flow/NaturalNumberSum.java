package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;

import java.util.*;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = sc.nextInt();       // take number as input from user

        int sum =(number*(number+1))/2;      // calculate sum of natural numbers

        if(number<0){     // condition for number is not a natural number
            System.out.print("The number "+number+" is not a natural number");
        }
        else{
            System.out.print("The sum of "+number+" natural numbers is "+sum);
        }
    }
}
