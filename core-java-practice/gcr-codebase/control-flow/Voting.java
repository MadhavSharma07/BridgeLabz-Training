package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;
 
import java.util.*;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age:");
        int age = sc.nextInt();       // take age as input from user

        if(age>= 18){     // condition for age is equal or greater than 18
            System.out.print("The person's age is "+age+" and can vote.");     // print output
        }
 
        else{     // condition for age is less than 18
            System.out.print("The person's age is "+age+" and cannot vote.");     // print output
        }
    }
}
