package string;

import java.util.*;

public class NullPointerExceptionDemontrate {

	public static void main(String[] args) {
		

	}
	
	public static void generateException(String str) {
	        int length = str.length(); 
	        System.out.println("Length of the string: " + length);
	}
	 public static void handleException(String text) {
	        try {
	            int length = text.length(); 
	            System.out.println("Length of the string: " + length);
	        } catch (NullPointerExceptionDemontrate e) {
	            System.out.println("Caught NullPointerException: " + e.getMessage());
	        } catch (RuntimeException e) {
	            System.out.println("Caught RuntimeException: " + e.getMessage());
	        }
	    }
	    
}


