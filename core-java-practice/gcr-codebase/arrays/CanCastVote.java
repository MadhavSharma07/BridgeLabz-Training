package BridgeLabz-Training.core-java-practice.gcr-codebase.arrays;

import java.util.*;

public class CanCastVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];         // initialise array

        for(int i=1;i<=10;i++){       // take input from user
            System.out.println("Enter the age of Student"+i);
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<10;i++){
            if(arr[i]<0){          // condition for negative age
                System.out.println("Invalid age "+arr[i]);
            }
            else if(arr[i]>=18){        // condition for age greater or equal to 18
                System.out.println("The student with the age "+arr[i]+" can vote.");
            }
            else{
                System.out.println("The student with the age "+arr[i]+ " cannot vote");
            }
        }
    }
}
