package string;

import java.util.*;

public class StringIndexOutOfBoundExceptionDemontrate {

		 public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String userInput = sc.next();

		        try {
		            generateException(userInput);
		        } catch (Exception e) {
		            System.out.println("Exception in generateException(): " + e.getMessage());
		        }

		        handleException(userInput);
		    }
		 
		 public static void generateException(String input) {
		        char ch = input.charAt(input.length());
		        System.out.println("Character at invalid index: " + ch);
		    }
		 
		 public static void handleException(String input) {
		        try {
		            char ch = input.charAt(input.length());
		            System.out.println("Character at invalid index: " + ch);
		        } catch (StringIndexOutOfBoundsException e) {
		            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
		        } catch (RuntimeException e) {
		            System.out.println("Caught RuntimeException: " + e.getMessage());
		        }
		    }

		 
		 

	}


