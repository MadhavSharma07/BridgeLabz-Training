package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;


import java.util.*;
public class GreatestFactorUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = sc.nextInt();       // take number as input from user

        int greatestFactor =1;
        int counter = number-1;

        while(counter>=1){        // loop iterates from number-1 to 1
            if(number%counter==0){          //  number is divided i
                greatestFactor=counter;
                break;              // break the loop 
            }
            counter--;
        }
        System.out.println("The greatest factor is "+greatestFactor);   // print greatest factor

    }
}
