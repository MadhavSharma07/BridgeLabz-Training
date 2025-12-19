package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;


import java.util.*;
public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amar's age:");
        int  amarAge = sc.nextInt();       // take  Amar's age as input from user
        System.out.println("Enter the Akbar's age:");
        int  akbarAge = sc.nextInt();       // take  Akbar's age as input from user
        System.out.println("Enter the Anthony's age:");
        int  anthonyAge = sc.nextInt();       // take  Anthony's age as input from user

        System.out.println("Enter the Amar's height:");
        int  amarHeight = sc.nextInt();       // take  Amar's height as input from user
        System.out.println("Enter the Akbar's height:");
        int  akbarHeight = sc.nextInt();       // take  Akbar's height as input from user
        System.out.println("Enter the Anthony's height:");
        int  anthonyHeight = sc.nextInt();       // take  Anthony's height as input from user

        if(amarAge<akbarAge){
            if(amarAge<anthonyAge){
                System.out.println("Amar is the youngest friend at age "+amarAge);
            }
        }
        if(akbarAge<amarAge){
            if(akbarAge<anthonyAge){
                System.out.println("Akbar is the youngest friend at age "+akbarAge);
            }
        }
        if(anthonyAge<amarAge){
            if(anthonyAge<akbarAge){
                System.out.println("Anthony is the youngest friend at age "+anthonyAge);
            }
        }


        if(amarHeight>akbarHeight){
            if(amarHeight>anthonyHeight){
                System.out.println("Amar is the tallest friend at height "+amarHeight);
            }
        }
        if(akbarHeight>amarHeight){
            if(akbarHeight>anthonyHeight){
                System.out.println("Akbar is the tallest friend at height "+akbarHeight);
            }
        }
        if(anthonyHeight>amarHeight){
            if(anthonyHeight>akbarHeight){
                System.out.println("Anthony is the tallest friend at height "+anthonyHeight);
            }
        }
    }
}
