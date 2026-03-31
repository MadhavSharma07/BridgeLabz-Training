package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;


import java.util.*;
public class MultipleLessThan100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number(between 1-100):");

        int number = sc.nextInt();       // take number as input from user

        if(number>0 && number<=100){
            for(int i =100;i>=1;i--){      // loop iterates from 100 to 1
                if(number%i==0){              // number is divided by i
                    System.out.println("The multiples of "+number+" are "+i);     // print the output
                }
            }
        }

        else{
            System.out.println("Enter the valid input");
        }
    }


    
}
