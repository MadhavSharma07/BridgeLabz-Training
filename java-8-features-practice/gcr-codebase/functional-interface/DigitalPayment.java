package functional_interface;

interface Payment{  // interface Payment
	void pay(double amount);
}

class UPI implements Payment{  // class UPI using Payment interface
	
	@Override
	public void pay(double amount) {
		System.out.println("UPI Payment -> "+amount);
	}
}

class CreditCard implements Payment{  // class Credit Card using Payment interface
	
	@Override
	public void pay(double amount) {
		System.out.println("Credit Card Payment -> "+amount);
	}
}

class Wallet implements Payment{  // class Wallet using Payment interface
	
	@Override
	public void pay(double amount) {
		System.out.println("wallet Payment -> "+amount);
	}
}


public class DigitalPayment {  // main class

	public static void main(String[] args) { // main  method
		
		Payment upi = new UPI();  // create class object and give reference to Payment interface 
		Payment creditCard = new CreditCard();
		Payment wallet = new Wallet();
		
		upi.pay(10);
		creditCard.pay(20);
		wallet.pay(30);

	}

}
