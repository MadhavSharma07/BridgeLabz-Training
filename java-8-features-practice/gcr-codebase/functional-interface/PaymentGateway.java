package functional_interface;



interface Payment {  // interface Payment 

    void pay(double amount);

    //method add without breaking old implementations
    default void refund(double amount) {
        System.out.println("Default refund of " + amount + " processed.");
    }
}

class Upi implements Payment {  // class UPI using Payment interface

    @Override
    public void pay(double amount) {
        System.out.println("UPI payment of " + amount + " successful.");
    }
}

class CreditCard implements Payment { // class Credit Card using Payment interface

    @Override
    public void pay(double amount) {
        System.out.println("Credit Card payment of " + amount + " successful.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Credit Card refund of " + amount + " initiated.");
    }
}




public class PaymentGateway {  // main class

	public static void main(String[] args) {
		 Payment upi = new Upi();
	        upi.pay(500);
	        upi.refund(200);   // default refund

	        Payment card = new CreditCard();
	        card.pay(1000);
	        card.refund(400);  // overridden refund method

	}

}
