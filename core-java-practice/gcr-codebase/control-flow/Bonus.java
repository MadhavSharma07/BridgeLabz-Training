package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;

import java.util.*;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the salary:");
        int salary = sc.nextInt();       // take salary as input from user
        System.out.print("Enter the years ofservice:");
        int serviceYear = sc.nextInt();       // take number as input from user

        if(serviceYear>5){
            double bonusAmount= salary*0.05;
            System.out.println("The bonus amount is "+bonusAmount);
        }
        else{
            System.out.println("No bonus - Years of service is less than 5 years.");
        }
    }
}
