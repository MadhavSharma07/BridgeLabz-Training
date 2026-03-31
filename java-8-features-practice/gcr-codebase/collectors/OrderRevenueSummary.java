package collectors;

import java.util.*;
import java.util.stream.Collectors;

public class OrderRevenueSummary {

    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order("Arjun", 500),
                new Order("Neha", 300),
                new Order("Arjun", 200),
                new Order("Neha", 150),
                new Order("Ravi", 400)
        );

        // Sum order totals per customer
        Map<String, Double> revenueByCustomer =
                orders.stream()
                        .collect(Collectors.groupingBy(
                                Order::getCustomerName,
                                Collectors.summingDouble(Order::getAmount)
                        ));

        System.out.println(revenueByCustomer);  // print output
    }
}


class Order {
    private String customerName;
    private double amount;

    Order(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmount() {
        return amount;
    }
}

