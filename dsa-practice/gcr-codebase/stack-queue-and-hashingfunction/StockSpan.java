package gcr-codebase.stack-queue-and-hashingfunction;

import java.util.*;

public class StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days:");
        int n = sc.nextInt();    // take number of days from  user
        int[] price = new int[n]; // price array
        System.out.println("Enter the stock price for each day:");
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        
        int[] spanStock = stockSpanCalculation(price);  // span stock array
        
        System.out.println("Stock Span for each day: " + Arrays.toString(spanStock));
    }
   public static int[] stockSpanCalculation(int[] price) {  // method to  calculate stock span
        int n = price.length;
        int[] spanStock = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                spanStock[i] = i + 1; 
            } else {
                spanStock[i] = i - stack.peek(); 
            }
            stack.push(i); 
        }
        
        return spanStock;
    }
}
