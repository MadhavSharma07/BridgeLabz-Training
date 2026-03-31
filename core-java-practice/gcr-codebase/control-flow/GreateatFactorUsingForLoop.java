package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;

import java.util.*;
public class GreateatFactorUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = sc.nextInt();       // take number as input from user

        int greatestFactor =1;

        for(int i= number-1 ;i>=1;i--){        // loop iterates from number-1 to 1
            if(number%i==0){          //  number is divided i
                greatestFactor=i;
                break;              // break the loop 
            }
        }
        System.out.println("The greatest factor is "+greatestFactor);   // print greatest factor

    }
}
