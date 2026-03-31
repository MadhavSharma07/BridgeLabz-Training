package BridgeLabz-Training.core-java-practice.gcr-codebase.programming-elements;

import java.util.*;


public class FeeDiscountUserInput {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fee = sc.nextInt();   // university fee with user input
        int discount =sc.nextInt();     // discount given by university with user input
        int discountedAmount = fee / discount;          // calculate discounted amount
        int studentPayingFee = fee - discountedAmount ;           //  calculate fee paid by Student

        System.out.print("The Discount amount is INR "+discountedAmount+" and the final discounted fee is INR "+studentPayingFee);     // print the result


    }
}
