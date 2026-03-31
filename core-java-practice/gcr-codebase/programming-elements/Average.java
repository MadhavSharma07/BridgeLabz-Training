package BridgeLabz-Training.core-java-practice.gcr-codebase.programming-elements;
  import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");         // input first number from user
        int num1 = sc.nextInt();
        System.out.print("Enter the second number:");      // input second number from user
        int num2 = sc.nextInt();
        System.out.print("Enter the third number:");      // input third number from user
        int num3 = sc.nextInt();

        double average=(num1+num2+num3)/3;   // calculate the average
        System.out.print("The average of three numbers is:"+average);  // print the average
        
    }
}
