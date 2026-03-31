package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;


import java.util.*;
public class FactorsUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = sc.nextInt();       // take number as input from user

        int counter=1;

        while(counter<number){
            if(number%counter==0){                 // number is fully divided by counter
                System.out.println(counter);        // print the factor
            }
            counter++;
        }
    }
}
