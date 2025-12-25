public class Product {

    
    static double discountPercent = 5.0; //  static variable discount  Percent 

    
    private String productName;  // instance variables
    private double price;
    private int quantity;

    
    private final int productID;  // final variable

    
    public Product(int productID, String productName, double price, int quantity) {  // constructor
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    
    public static void updateDiscount(double newDiscount) {   // static method to update discount percent
        discountPercent = newDiscount;
    }

    
    public double calculateTotal() {    // Method to calculate total price after discountPercent
        double total = price * quantity;
        double discountAmount = total * (discountPercent / 100);
        return total - discountAmount;
    }

    
    public void printDetails() {   // method to display product details
        System.out.println("Product ID   : " + productID);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Discount     : " + discountPercent + "%");
        System.out.println("Total Amount : " + calculateTotal());
    }

    
    public static void main(String[] args) {

        Product product1 = new Product(01, "Sofa", 5000, 2);  // create object product 1
        Product product2 = new Product(02, "TV", 10000, 1);        // create object product 2

        
        Product.updateDiscount(10.0);// update discount percent

        
        if (product1 instanceof Product) {           // instanceof check before processing details
            System.out.println("\nProduct 1 Details:");
            product1.printDetails();
        }

        if (p2 instanceof Product) {
            System.out.println("\nProduct 2 Details:");
            product2.printDetails();
        }
    }
}
