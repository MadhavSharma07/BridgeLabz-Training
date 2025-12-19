package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;

import java.util.*;

public class FizzBuzzUsingWhileLoop {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = sc.nextInt();       // take number as input from user

        if(number<0){           // condition for invalid input
            System.out.println("Enter the postive number");     
        }
        while(number>0){         
            if(number%3==0){                     // number is divided by 3
                System.out.println("Fizz");
            }
            else if (number%5==0) {                // number is divided by 5
                System.out.println("Buzz");
            }
            else if(number%3==0 && number%5==0){               // number is divided by 3 and 5
                System.out.println("FizzBuzz");
            }
            else{
                System.out.println(number);
            }

            number--;
        }

    }
}
