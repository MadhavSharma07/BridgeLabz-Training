package string;

import java.util.*;

public class StringComparison {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string:");
		String str1 = sc.nextLine();                   // input string 1 from user
		System.out.println("Enter the second string:");
		String str2 = sc.nextLine();                 // input string 2 from user
		
		boolean charAtResult = charAtComparison(str1 ,str2);
		boolean equalsResult = str1.equals(str2);     // comparison with built-in function
		
		
		System.out.println("Result of charAt() is: "+charAtResult);
		System.out.println("Result of equals() is: "+equalsResult);
		
		if(charAtResult == equalsResult) {
			System.out.println("Results are equal.");
		}
		else {
			System.out.println("Results are not equal.");
		}
		
		
		
		

	}
	
	public static boolean charAtComparison(String str1 , String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i) != str2.charAt(i)) {
				return false;
			}
		}
		
		return true;
	}

}
