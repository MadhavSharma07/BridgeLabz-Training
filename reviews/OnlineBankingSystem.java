import java.util.*;

public class OnlineBankingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Account> list = new ArrayList<>();
        Record record = new Record(100, "Madhav", list);

        int choice;

        do {
            System.out.println("\n//////// Banking System ///////");
            System.out.println("1. Add Account");
            System.out.println("2. Credit Cash");
            System.out.println("3. Withdraw Cash");
            System.out.println("4. Get Balance");
            System.out.println("5. Display Account");
            System.out.println("6. Delete Account");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1: 
                    System.out.print("Enter Account Number: ");  // add Account
                    int accNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Account Holder Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Account Type (Savings/Current): ");
                    String type = sc.nextLine();

                    Account acc;
                    if (type.equalsIgnoreCase("Savings")) {
                        acc = new SavingsAccount(accNo, name, type);
                    } else {
                        acc = new CurrentAccount(accNo, name, type);
                    }

                    record.addAccount(acc);
                    System.out.println("Account added successfully");
                    break;

                case 2:                                 
                    System.out.print("Enter amount to credit: ");   // Credit amount
                    int credit = sc.nextInt();
                    Account.creditCash(credit);
                    System.out.println("Amount credited successfully");
                    break;

                case 3: 
                    System.out.print("Enter account number: ");   // withdraw amount
                    int wAcc = sc.nextInt();

                    System.out.print("Enter amount to withdraw: ");
                    int wAmt = sc.nextInt();

                    record.withdraw(wAcc, wAmt);
                    break;

                case 4: 
                    System.out.println("Current Balance: " + Account.amount);  // get amount
                    break;

                case 5: 
                    record.display();   // display account details
                    break;

                case 6: 
                    System.out.print("Enter account number to delete: ");   // delete amount
                    int dAcc = sc.nextInt();
                    record.deleteAccount(dAcc);
                    break;

                case 0:
                    System.out.println("Thank you for using Banking System");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

    }
}



class Account{
    private static  int accountNumber;
    private  static String accountHolder;
    static int amount=0;


   Account(int accountNumber,String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public  int getAccountNumber(){
        return accountNumber;
    }
    public  String getAccountHolder(){
        return accountHolder;
    }

    public int getAmount(){
        return amount;
    }

    public  int withdrawCash(int cash){
        if(amount<0){
            System.out.println("Not Enough Amount");
        }
        amount = amount-cash;
        return amount;
    }

    public static int creditCash(int cash){
        return amount+=cash;
    }

     
    public static int interestCalculations(int interest){
        amount+= (interest*amount);
        
        return amount;
    }


}

class SavingsAccount extends Account{
    static String accountType;
    static int interest = 5;
    SavingsAccount(int accountNumber,String accountHolder,String accountType){
        super(accountNumber, accountHolder);
        this.accountType="Savings Account";
    }

    
    public static int interestCalculations(){
        amount+=(interest*amount);
        return amount;
    } 
}

class CurrentAccount extends Account{

    static String accountType;
    static int interest = 12;

    CurrentAccount(int accountNumber,String accountHolder,String accountType){
        super(accountNumber, accountHolder);
        this.accountType="Current Account";
    }

    public static int interestCalculations(){
        amount+=(interest*amount);
        return amount;
    }
}

class Record extends Account {
    List<Account> record = new ArrayList<>() ;
    Record(int accountNumber,String  accountHolder,List<Account>record){
        super(accountNumber, accountHolder);
        this.record= record;
        
    }

    public  void  addAccount(Account account){
        record.add(account);
    }

    public void deleteAccount(int accountNumber) {

        for (int i = 0; i < record.size(); i++) {
            Account acc = record.get(i);

            if (acc.getAccountNumber() == accountNumber) {
                record.remove(i);
                System.out.println("Account deleted successfully");
                return;
            }
        }

            System.out.println("Account not found");
    }


   public void withdraw(int accountNumber, int amount) {
        Account acc = new Account(accountNumber, getAccountHolder());
       
        if (acc.getAccountNumber()==accountNumber) {
            acc.withdrawCash(amount);
            System.out.println("Amount withdrawn successfully");
        }
    }

    public void display(){
        Account acc = new Account(getAccountNumber(), getAccountHolder());
        System.out.println("Account Holder: "+acc.getAccountHolder());
        System.out.println("AccountNumber"+acc.getAccountNumber());
        System.out.println("Amount: "+acc.getAmount());
    }
}

    
    



    
