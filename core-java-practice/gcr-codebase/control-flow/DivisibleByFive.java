package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;

import java.util.*;

public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = sc.nextInt();       // take input from user
        String result = new String();

        if(number %5 ==0){  // condition for number divisible by 5 
            result ="Yes";     
            System.out.print(" Is the number "+number+" divisible by 5?"+result);
        }
        else{           // if number is not divisible by 5 then this block is executed
            result ="No";     
            System.out.print(" Is the number "+number+" divisible by 5?"+result);
        }

    }
}
