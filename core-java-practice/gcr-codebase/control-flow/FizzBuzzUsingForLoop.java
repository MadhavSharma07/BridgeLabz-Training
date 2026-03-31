package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;

import java.util.*;

public class FizzBuzzUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = sc.nextInt();       // take number as input from user

        if(number<0){
            System.out.println("Enter the postive number");
        }
        for(int i=1;i<=number;i++){
            if(i%3==0){
                System.out.println("Fizz");
            }
            else if (i%5==0) {
                System.out.println("Buzz");
            }
            else if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else{
                System.out.println(number);
            }
        }

    }
}
