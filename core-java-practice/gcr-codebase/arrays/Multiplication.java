package BridgeLabz-Training.core-java-practice.gcr-codebase.arrays;

import java.util.*;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");   // take input from user

        int number = sc.nextInt();

        int multiplication[] = new int[10];    // initialise array 

        for(int i=0;i<10;i++){           // store result in array
            multiplication[i] = number*(i+1);
        }

        for(int i=0;i<10;i++){
            System.out.println(number+" * "+(i+1)+" = "+multiplication[i]);   // print the result
        }

    }
}
