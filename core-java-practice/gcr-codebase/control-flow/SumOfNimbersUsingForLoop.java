package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;

import java.util.*;

public class SumOfNimbersUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = sc.nextInt();       // take number as input from user

        int sumUsingFormula =(number*(number+1))/2;      // calculate sum of natural numbers using formula

        int sumUsingLoop=0;
        
        for(int i=1;i<=number;i++){
            sumUsingLoop+=number;              // calculate sum using loop
        }

        if(sumUsingFormula==sumUsingLoop){
            System.out.println("Both results are equal");       // print output
        }
        else{
            System.out.println("Both results are not equal ");   // print output
        }

    }
}
