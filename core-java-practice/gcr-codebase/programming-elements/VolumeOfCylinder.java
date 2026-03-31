package BridgeLabz-Training.core-java-practice.gcr-codebase.programming-elements;

import java.util.*;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius:");
        double radius= sc.nextDouble();             // take input radius from user
        System.out.print("Enter the height:");
        double height= sc.nextDouble();             // take input height from user
        double volume=0;         // to store the volume of cylinder
     
        volume  =(3.14*radius*radius*height);       // formula
        System.out.print("The volume of cylinder is:"+volume); 
    }
}
