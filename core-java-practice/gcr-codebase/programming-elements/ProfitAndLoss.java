package BridgeLabz-Training.core-java-practice.gcr-codebase.programming-elements;

public class ProfitAndLoss {
    public static void main(String[] args) {
        int costPrice = 129;      // given cost price of product
        int sellingPrice = 191;     // given selling price of product

        int profit = sellingPrice - costPrice;   // calculate profit
        double profitPercentage = (profit/costPrice)*100;   // calculate profit percenatage
        
        System.out.print("The Cost Price is INR "+costPrice+"and Selling Price is INR"+sellingPrice);        // print cost price and selling price
        System.out.print("The Profit is INR "+profit+" and the Profit Percentage is "+profitPercentage);     // print profit and profit percentage

    }
}
