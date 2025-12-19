package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;


import java.util.*;
public class Springseason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day:");
        int day = sc.nextInt();       // take day as input from user
        System.out.print("Enter the month:");
        int month = sc.nextInt();       // take month as input from user

        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day < 21)) {      // condtion for spring season
            System.out.println("It's Spring season.");     // print output
        } 
        else {
            System.out.println("It's not spring season.");       // print output
        }
        
    }
}
