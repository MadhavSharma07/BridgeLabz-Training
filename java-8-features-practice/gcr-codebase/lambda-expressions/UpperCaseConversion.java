package com.lambda_function;
import java.util.ArrayList;
import java.util.List;


public class UpperCaseConversion {
	    public static void main(String[] args) {

	        List<String> employees = new ArrayList<>();

	        employees.add("Arjun");
	        employees.add("Madhav");
	        employees.add("Shivam");
	        employees.add("Aditya");

	        // Convert names to uppercase using method reference
	        employees.stream()
	                 .map(String::toUpperCase)
	                 .forEach(System.out::println);
	    }
}

