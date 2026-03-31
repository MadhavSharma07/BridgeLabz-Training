package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;


import java.util.*;
public class PowerUsingWhileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number:");
        int number = sc.nextInt();       // take number as input from user
        System.out.print("Enter the power:");
        int power = sc.nextInt();       // take powerr as input from user

        int result =1;
        int counter = 0;

        if(number >0){
            while(counter!=power){            // while loop to calculate power result
                result*=number;
                counter++;
            }
        }

        else{                    // condition for invalid input
            System.out.println("Enter the valid input");
        }

        System.out.println("The result is "+result);   // print result

        
    }
    
}
