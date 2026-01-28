package com.flip_key_logical;

import java.util.Scanner;

public class FlipKeyLogical {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the input : ");
    	String str = sc.nextLine();
    	if(cleanseAndInvert(str)=="") {
    		System.out.println("Invalid Input");
    	}else {
    	System.out.println("The generated key is - "+cleanseAndInvert(str));
    	}
    }
    
    public  static String cleanseAndInvert(String input) {
    	if(input.length()<6 || input==null) {
    		return "";
    	}
    	if(input.trim().contains(" ") || input.trim().matches(".*(\\d|[^a-zA-Z]).*")) {
    		return "";
    	}
    	
    	input = input.toLowerCase();
    	
    	String ans="";
    	for(int i=0;i<input.length();i++) {
    		if((int)input.charAt(i)%2==0) {
    			continue;
    		}
    		else {
    			ans+=input.charAt(i)+"";
    		}
    	}
    	
    	String reverseString="";
    	for(int i=ans.length()-1;i>=0;i--) {
    		reverseString+=ans.charAt(i);
    	}
    	
    	String resultantString ="";
    	for(int i=0;i<reverseString.length();i++) {
    		if(i%2==0) {
    		resultantString+=(char)(reverseString.charAt(i)-32)+"";
    		
    		}
    		else {
    			resultantString+=reverseString.charAt(i)+"";
    		}
    	}
    	
    	return resultantString;
    }
}
