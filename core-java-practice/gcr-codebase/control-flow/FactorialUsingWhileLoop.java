package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;

import java.util.*;

public class FactorialUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number:");
        int number = sc.nextInt();       // take number as input from user

        int factorial=0;
        if(number<=0){             // condtion for invalid natural number or positive number
            System.out.println("Enter the valid natural number");
        }
        
        while(number>0){
            factorial*=number;   // calculate the factorial using while loop
            number--;
        }

        System.out.println("The factorial is "+factorial);
        
    }
}
