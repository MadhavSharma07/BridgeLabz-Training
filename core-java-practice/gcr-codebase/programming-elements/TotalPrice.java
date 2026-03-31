package BridgeLabz-Training.core-java-practice.gcr-codebase.programming-elements;

import java.util.*;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int itemPrice = sc.nextInt();       // take price of item by user
        int itemQuantity  = sc.nextInt();     // take quantity of item by user

        int totalPrice = itemPrice * itemQuantity;  // calculate total price

        System.out.print(" The total purchase price is INR "+totalPrice+" if the quantity "+itemQuantity+" and unit price is INR "+itemPrice);  // print the output
    }
}
