package BridgeLabz-Training.core-java-practice.gcr-codebase.programming-elements;


import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount:");
        double principal = sc.nextDouble(); // take input principal from user
        System.out.print("Enter the rate:");
        double rate = sc.nextDouble(); // take input rate from user
        System.out.print("Enter the time:");
        double time = sc.nextDouble(); // take input time from user
        double simpleInterest=0;         // store the simple interest

        simpleInterest  =(principal * rate* time )/100;       // formula
        System.out.print("The simple interest is:"+simpleInterest);     // print simple interest
    }

}
