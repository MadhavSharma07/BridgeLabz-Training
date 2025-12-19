package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;
import java.util.*;


public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = sc.nextInt();       // take number as input from user

        if(number<0 ){        // condition 
            System.out.println("Enter the valid input(greater than 0)");
        }
        for(int i=1;i<=number;i++){
            if(i%2==0){
                System.out.println(i+" is the even number.");
            }
            else{
                System.out.println(i+" is the odd number.");
            }
        }


        
        
    }
}
