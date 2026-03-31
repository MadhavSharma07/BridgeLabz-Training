package BridgeLabz-Training.core-java-practice.gcr-codebase.arrays;

import java.util.*;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height[] = new double[11];    // initialise the array

        double sum=0;
        for(int i=0;i<11;i++){
            System.out.println("Enter the height of player"+(i+1));
            height[i] =sc.nextDouble();                  // take  height of players from user
        }

        for(int i=0;i<11;i++){
            sum+=height[i];
        }

        double meanHeight = sum/11;
        System.out.println("The mean height of players is "+meanHeight);


    }
}
