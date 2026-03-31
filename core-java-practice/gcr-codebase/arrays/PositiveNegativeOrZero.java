package BridgeLabz-Training.core-java-practice.gcr-codebase.arrays;

import java.util.*;

public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = new int[5];

         for(int i=1;i<=5;i++){       // take input from user
            System.out.println("Enter the number"+i);
            number[i]=sc.nextInt();
        }

        for(int i=0;i<5;i++){
            if(number[i]>0){
                if(number[i]%2==0){
                    System.out.println(number[i]+" is positive and even number.");
                }
                else{
                    System.out.println(number[i]+" is positive and odd number.");
                }
            }

            else if(number[i]<0){
                System.out.println(number[i]+" is negative.");
            }
            else if(number[i]==0){
                System.out.println("Number is zero");
            }

        }

        if(number[0]==number[4]){
            System.out.println("First and last element are equal");
        }
        else{
            System.out.println("First and last element are not equal");
        }




    }
}
