package BridgeLabz-Training.core-java-practice.gcr-codebase.programming-elements;

import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius:");
        double radius= sc.nextDouble();             // take input radius from user
        double area=0;         // to store the area  of circle
     
        area  =(3.14*radius*radius);       // formula
        System.out.print("The area of circle is:"+area);     // print area of circle
    
    }

}
