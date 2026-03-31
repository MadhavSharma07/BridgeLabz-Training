package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;

import java.util.*;


public class SumOfNumbersUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean flag =true;

        int sum=0;

        while(flag){
            System.out.print("Enter the number:");
            int number = sc.nextInt(); // take number as input from user
            if(number==0){
                break;
            }
            sum+=number;
        }

        System.out.println(sum);
    }
}
