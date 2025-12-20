package BridgeLabz-Training.core-java-practice.gcr-codebase.arrays;

import java.util.*;

public class MultiplicationTable6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");   // take input from user

        int number = sc.nextInt();

        int multiplication[] = new int[4];    // initialise array 

        for(int i=0;i<4;i++){           // store result in array
            multiplication[i] = number*(i+6);
        }

        for(int i=0;i<4;i++){
            System.out.println(number+" * "+(i+6)+" = "+multiplication[i]);   // print the result
        }
    }
}
