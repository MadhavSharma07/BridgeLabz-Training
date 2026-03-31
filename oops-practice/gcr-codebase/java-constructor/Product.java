package oops.gcr-codebase.java-constructor;

public class Product {
    String productName;
    double price;
    static int totalProduct = 0;
    
    public Product(String productName, double price) {        // constructor
        this.productName = productName;
        this.price = price;
        totalProduct++; 
    }
    public void printProductDetail() {        // method to display details of product
        System.out.println("Product Name: " + productName);
        System.out.println("Price:" + price);
    }

    public static void printTotalProduct() {        // method to print total products
        System.out.println("Total Products Created: " + totalProduct);
    }

    public static void main(String[] args) {
        Product product1 = new Product("Telivision", 55000.0);  // create object product1
        Product product2 = new Product("Sofa", 25000.0);        //create object product2
        product1.printProductDetail();
        System.out.println();
        product2.printProductDetail();
        System.out.println();
        Product.printTotalProduct(); 
    }
}
