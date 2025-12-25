public class BankAccount {

    
    static String bankName = "SBI";              // static variable shared by all accounts
    private static int totalAccounts = 0;     // static number 

    
    private final int accountNumber;      // final account number variable 
    private String accountHolderName;       // final holder name variable

    
    public BankAccount(int accountNumber, String accountHolderName) {     // Constructor
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++;
    }

    
    public static void getTotalAccounts() {              // static method to display total accounts
        System.out.println("Total accounts created: " + totalAccounts);
    }

   
    public void displayDetails() {       // method to display account details
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
    }

    
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(01, "Aditya"); // create object aacount 1
        BankAccount account2 = new BankAccount(02, "Sarthak");// create object account 2

        
        if (account1 instanceof BankAccount) {          // instanceof check before displaying details
            System.out.println("\nAccount 1 Details:");
            account1.displayDetails();
        }

        if (account2 instanceof BankAccount) {
            System.out.println("\nAccount 2 Details:");
            account2.displayDetails();
        }

        
        BankAccount.getTotalAccounts();
    }
}
