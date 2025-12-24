package oops.gcr-codebase.class-and-object;

class BankAccount {
    // non static variables

    private String accountHolder;
	private String accountNumber;
	private double balance;

    BankAccount(String accountHolder,String accountNumber,double balance) {      // constructor
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}


    public void depositAmount(double amount) {            // method to  claculate deposit amount 
		if(amount > 0) {
			balance+=amount;
			System.out.println("Deposited: "+amount);
		}
		else {
			System.out.println("Amount to deposit must be positive");
		}
	}

    public void withdrawAmount(double amount) {           // method to  claculate withdraw amount 
		if (amount <= balance && amount > 0) {
			balance -= amount;
			System.out.println("Withdraw amount is : "+amount);
		}
		else if (amount <= 0) {
			System.out.println("Withdrawal amount must be positive");
		}
		else {
			System.out.println("Insufficient balance");
		}
	}

    public void display() {                          // method to display current balance
       System.out.println("Current balance: " + balance);
   }

    public static void main(String[] args) {
       
       BankAccount account = new BankAccount("Lynda", "123456789", 700.00);     //Creating a BankAccount object
    
       
       account.display();                // Display initial balance
       
       account.depositAmount(200.00); // Deposit money
       account.display();
       
       account.withdrawAmount(100.00);            // Withdraw money
       account.display();
       
       account.withdrawAmount(900.00);         // Try to withdraw more than the available balance
    }


}
