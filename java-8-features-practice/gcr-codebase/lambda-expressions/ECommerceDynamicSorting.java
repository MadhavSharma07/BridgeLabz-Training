package com.lambda_function;

import java.util.ArrayList;
import java.util.List;

class Product {
	    String name;
	    double price;
	    double rating;
	    int discount;

	    Product(String name, double price, double rating, int discount) {
	        this.name = name;
	        this.price = price;
	        this.rating = rating;
	        this.discount = discount;
	    }

	    @Override
	    public String toString() {
	        return name +" , Price: " + price +" , Rating: " + rating +" , Discount: " + discount + "%";
	    }
	    
}
	    
public class ECommerceDynamicSorting {

	    public static void main(String[] args) {

	        List<Product> products = new ArrayList<>();

	        products.add(new Product("Laptop", 70000, 4.5, 10));
	        products.add(new Product("Mobile", 30000, 4.7, 20));
	        products.add(new Product("Headphones", 3000, 4.2, 30));

	        //  Choose sorting type
	        String sortBy = "discount"; // price | rating | discount

	        if (sortBy.equals("price")) {
	            products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
	        }

	        if (sortBy.equals("rating")) {
	            products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
	        }

	        if (sortBy.equals("discount")) {
	            products.sort((p1, p2) -> Integer.compare(p2.discount, p1.discount));
	        }

	        // Print result 
	        for (Product p : products) {
	            System.out.println(p);
	        }
	    }
}

