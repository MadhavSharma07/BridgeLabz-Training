package com.flip_key_logical;

import java.util.Scanner;

public class FlipKeyLogical {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the input : ");
    	String str = sc.nextLine();
    	if(cleanseAndInvert(str)=="") {  // output is empty string 
    		System.out.println("Invalid Input");
    	}else {
    	System.out.println("The generated key is - "+cleanseAndInvert(str)); // print specified output
    	}
    }
    
    public  static String cleanseAndInvert(String input) {
    	if(input.length()<6 || input==null) {  // condition for input has less than 6 characters  or null
    		return "";
    	}
    	if(input.trim().contains(" ") || input.trim().matches(".*(\\d|[^a-zA-Z]).*")) {  // condition for input has space, digits or special characters
    		return "";
    	}
    	
    	input = input.toLowerCase();  // change string to lowercase
    	
    	String ans="";
    	for(int i=0;i<input.length();i++) {
    		if((int)input.charAt(i)%2==0) {  // remove even ASCII values character
    			continue;
    		}
    		else {
    			ans+=input.charAt(i)+"";
    		}
    	}
    	
    	String reverseString="";
    	for(int i=ans.length()-1;i>=0;i--) {
    		reverseString+=ans.charAt(i);  // reverse the string
    	}
    	
    	String resultantString ="";
    	for(int i=0;i<reverseString.length();i++) {
    		if(i%2==0) {  // condition for  even index
    		resultantString+=(char)(reverseString.charAt(i)-32)+""; // change to uppercase and add in string
    		
    		}
    		else { // odd index
    			resultantString+=reverseString.charAt(i)+"";  // add in string in lowercase 
    		}
    	}
    	
    	return resultantString;
    }
}
