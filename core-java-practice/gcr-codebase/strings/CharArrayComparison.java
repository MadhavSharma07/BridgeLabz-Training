package string;

import java.util.Scanner;

public class CharArrayComparison {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();                   // input string  from user
		 
		char[] builtInCharArray = str.toCharArray();  // initialise built in char array 
		char[] userCharArray = getUserCharArray(str); // initialise user char array
		
		 boolean same = compareCharArrays(builtInCharArray,userCharArray);          // compare both char arrays
		 
		 
		 System.out.println("User Character Array: ");
	        for (char c :userCharArray ) {            // print  user char array
	            System.out.print(c + " ");
	        }
	        System.out.println("\nBuilt-in Character Array: ");
	        for (char c :builtInCharArray ) {          // print built in char array
	            System.out.print(c + " ");
	        }
	        System.out.println("\nAre both character arrays equal? " + same);    // print result

	}
	
	public static char[] getUserCharArray(String str) {
        int length = str.length();
        char[] charArray = new char[length];
        for (int i = 0; i < length; i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }
	
	
	public static boolean compareCharArrays(char[] arr1, char[] arr2) {
	        if (arr1.length != arr2.length) return false;

	        for (int i = 0; i < arr1.length; i++) {
	            if (arr1[i] != arr2[i]) {
	                return false;
	            }
	        }

	        return true;
	 }

}
