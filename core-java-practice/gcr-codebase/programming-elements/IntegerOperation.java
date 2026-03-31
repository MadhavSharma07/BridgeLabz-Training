package BridgeLabz-Training.core-java-practice.gcr-codebase.programming-elements;
import java.util.*;

public class IntegerOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();               // take first number by user
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();               // take second number by user
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();               // take third number by user

        int operation1 = a+b*c;     // first integer operation
        int operation2 = a * b + c;   // second integer operation
        int operation3 = c + a/b;  //third integer operation
        int operation4 = a % b +c; //fourth integer operation

        System.out.print(" The results of Int Operations are "+operation1+" , "+operation2+" , "+operation3+" , and "+operation4);  // print output
        
    }
}
