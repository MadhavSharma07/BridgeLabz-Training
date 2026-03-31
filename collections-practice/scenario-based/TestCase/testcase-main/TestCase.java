package testcase;

public class TestCase {
	public double balance;
	public TestCase(double balance) {
		this.balance = balance;
	}
	
	public void depositAmount(double amount) throws InvalidException {
		if(amount <0) {
			throw new InvalidException("Amount can't be negative");
		}
		balance+=amount;
	}
	
	public void withdrawAmount(double amount) throws InvalidException {
		if(balance<amount) {
			throw new InvalidException("Insufficient balance");
		}
		balance-=amount;
	}
	
	
}
