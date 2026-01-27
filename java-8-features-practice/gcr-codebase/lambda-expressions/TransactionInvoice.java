package com.lambda_function;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Invoice {
	    private String transactionId;

	    // Constructor
	    Invoice(String transactionId) {
	        this.transactionId = transactionId;
	    }

	    @Override
	    public String toString() {
	        return "Invoice for Transaction ID: " + transactionId;
	    }
	}
	
public class TransactionInvoice {
	    public static void main(String[] args) {

	        List<String> transactionIds = new ArrayList<>();

	        transactionIds.add("Tsn01");
	        transactionIds.add("Tsn02");
	        transactionIds.add("Tsn03");

	        // Constructor reference 
	        List<Invoice> invoices = transactionIds.stream()
	                .map(Invoice::new)   // constructor reference
	                .collect(Collectors.toList());

	        // Print invoices
	        for (Invoice invoice : invoices) {
	            System.out.println(invoice);
	        }
	    }
	}

