package BridgeLabz-Training.core-java-practice.gcr-codebase.programming-elements;
 
import java.util.*;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle:");
        double length= sc.nextDouble();             // take input length from user
        System.out.print("Enter the breadth of rectangle:");
        double breadth= sc.nextDouble();             // take input breadth from user
        double perimeter=0;         // to store the perimeter of rectangle
     
        perimeter  =2*(length+breadth);       // formula
        System.out.print("The perimeter of rectangle is:"+perimeter);     // print perimeter of rectangle
    }
}
