package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;

import java.util.*;
public class MultipleLessThan100UsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number(between 1-100):");

        int number = sc.nextInt();       // take number as input from user

        int counter = number-1;

        if(number>0 && number<=100){
            while(counter>=1){      // loop iterates from 100 to 1
                if(number%counter==0){              // number is divided by counter
                    System.out.println("The multiples of "+number+" are "+counter);     // print the output
                }
                counter--;
            }
        }

        else{
            System.out.println("Enter the valid input");
        }
    }
}
