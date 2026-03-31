package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;

import java.util.*;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = sc.nextInt();       // take number as input from user

        for(int i=6;i<=9;i++){
            System.out.println(number+" * "+i+" = "+(number*i));
        }

    }
}
