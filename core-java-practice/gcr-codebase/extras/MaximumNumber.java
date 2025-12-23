package BridgeLabz-Training.core-java-practice.gcr-codebase.extras;
import java.util.Scanner;



public class MaximumNumber{

    public static int[] input() {       // Method to take three integers as input
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[3];

        System.out.print("Enter first number: ");
        numbers[0] = sc.nextInt();   // take first number from user

        System.out.print("Enter second number: ");
        numbers[1] = sc.nextInt();      // take second number from user

        System.out.print("Enter third number: ");
        numbers[2] = sc.nextInt();       // take third number from user

        return numbers;
    }

    
    public static int findMaximum(int[] nums) {      // Method to find maximum of three numbers
        int max = nums[0];

        if (nums[1] > max) {           // maximum element is greater than second number
            max = nums[1];
        }

        if (nums[2] > max) {            //maximum element is greater than third number
            max = nums[2];
        }

        return max;
    }

  
    public static void main(String[] args) {

        int[] values = input();
        int maximum = findMaximum(values);

        System.out.println("Maximum number is: " + maximum);   // print result
    }
}
