package oops-practice.gcr-codebase.object-oriented-design-principles;

import java.util.*;


class Account {    // Account class

    private int accountNumber;
    private double balance;
    private Bank bank;   // associated bank

    public Account(int accountNumber, double balance, Bank bank) { // Acoount class constructor
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
    }

    public void viewBalance() {       // method to display balance
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Bank Name     : " + bank.getBankName());
        System.out.println("Balance       : " + balance);
    }
}


class Customer {     // Customer class

    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {         // Customer class constructor
        this.name = name;
        this.accounts = new ArrayList<Account>();
    }

    
    public void addAccount(Account account) {      //   customer gets account from bank
        accounts.add(account);
    }

    public void viewAccounts() {      // method to diplay accounts
        System.out.println("Customer Name: " + name);
        for (Account acc : accounts) {
            acc.viewBalance();
            System.out.println();
        }
    }
}


class Bank {  // Bank class
 
    private String bankName;

    public Bank(String bankName) {   //constructor
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    
    public Account openAccount(Customer customer, int accNo, double amount) {    //    association method
        Account acc = new Account(accNo, amount, this);
        customer.addAccount(acc);
        return acc;
    }
}


public class BankAssociation {    // main class

    public static void main(String[] args) {

        Bank bank = new Bank("SBI"); // create bank object   

        Customer c1 = new Customer("Amit");       // create customer object
        Customer c2 = new Customer("Neha");

        bank.openAccount(c1, 101, 5000);
        bank.openAccount(c1, 102, 12000);
        bank.openAccount(c2, 201, 8000);

        System.out.println("Customer Account Details:\n");

        c1.viewAccounts();
        c2.viewAccounts();
    }
}

