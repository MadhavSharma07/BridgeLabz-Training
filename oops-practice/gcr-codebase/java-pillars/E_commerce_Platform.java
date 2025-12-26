package oops-practice.gcr-codebase.java-inheritance;

import java.util.*;

interface Taxable {         // ionterface Taxable
    double calculateTax(double price);

    double getTaxDatails();
}

abstract class Products implements Taxable {     // abstarct class Prducts
    private int productId;
    private String name;
    private double price;

    Products(int productId, String name, double price) {   // constructor
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    abstract double calculateDiscount(); // abstract method 

    public void display() {
        System.out.println("ProductId: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Base Price of product: " + price);
        System.out.println("Tax on product: " + getTaxDatails());
        System.out.println("Price after discount: " + calculateDiscount());
        System.out.println("Final Price: ₹" + calculateFinalPrice());
        System.out.println("................................");
    }

    public double calculateFinalPrice() {
        return calculateDiscount() + getTaxDatails();
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

}

class Electronics extends Products {      // subclass Electronics extends Products super class
    private double discount;
    private double tax;

    public Electronics(int productId, String name, double price, double discount, double tax) {   // constructor
        super(productId, name, price);
        this.discount = discount;
        this.tax = tax;
    }

    @Override
    public double calculateDiscount() {       // override function to claculate discount
        return getPrice() - (getPrice() * discount) / 100;
    }

    public double getTaxDatails() {   // method to get tax

        return calculateTax(getPrice());
    }

    public double calculateTax(double price) {         // method to calculate tax
        return (tax * price) / 100;
    }

}

class Clothing extends Products { // subclass Clothing extends Products super class
    private double discount;
    private double tax;

    public Clothing(int productId, String name, double price, double discount, double tax) {       // constructor
        super(productId, name, price);
        this.discount = discount;
        this.tax = tax;
    }

    @Override
    public double calculateDiscount() {   // override method to calculate discount
        return getPrice() - (getPrice() * discount) / 100;
    }

    public double getTaxDatails() {  // method to get tax

        return calculateTax(getPrice());
    }

    public double calculateTax(double price) {  // method to calculate tax
        return (tax * price) / 100;
    }

}

class Groceries extends Products {       // Groceries subclass extends Products super class
    private double discount;
    private double tax;

    public Groceries(int productId, String name, double price, double discount, double tax) {
        super(productId, name, price);
        this.discount = discount;
        this.tax = tax;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() - (getPrice() * discount) / 100;
    }

    public double getTaxDatails() {

        return calculateTax(getPrice());
    }

    public double calculateTax(double price) {
        return (tax * price) / 100;
    }

}

public class E_commerce_Platform {    // main class 

    public static void main(String[] args) {
        Products electronics = new Electronics(12, "One_Plus", 30000.0, 10, 20); // create object electronics
        Products clothing = new Clothing(13, "T-Shirt", 650.0, 10, 20);    // create object clothing
        Products groceries = new Groceries(14, "Almond", 40000.0, 20, 40);// create object groceries

        List<Products> products = new ArrayList<>();
        products.add(electronics);
        products.add(groceries);
        products.add(clothing);

        for (Products pr : products) {
            pr.display();
        }

    }

}