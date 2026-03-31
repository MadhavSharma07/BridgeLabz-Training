package BridgeLabz-Training.core-java-practice.gcr-codebase.programming-elements;

public class FeeDiscount {
    public static void main(String[] args) {
        int fee = 125000;   // university fee
        int discount =10;     // discount given by university
        int discountedAmount = fee / discount;          // calculate discounted amount
        int studentPayingFee = fee - discountedAmount ;           //  calculate fee paid by Student

        System.out.print("The Discount amount is INR "+discountedAmount+" and the final discounted fee is INR "+studentPayingFee);     // print the result


    }
}
