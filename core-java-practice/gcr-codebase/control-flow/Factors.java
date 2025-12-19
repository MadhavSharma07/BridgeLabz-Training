package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;

import java.util.*;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = sc.nextInt();       // take number as input from user

        for(int i=1;i<number;i++){
            if(number%i==0){
                System.out.println(i);
            }
        }
    }
}
