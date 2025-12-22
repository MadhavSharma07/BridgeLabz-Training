package string;

import java.util.Scanner;

public class SubStringComparison {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();                   // input string 1 from user
		System.out.println("Enter the starting index:");
		int start = sc.nextInt();                 // input starting index of substring from user
		System.out.println("Enter the ending index:");
		int end = sc.nextInt();                 // input ending index of substring from user
		
		String builtInSubStringResult = str.substring(start, end);      // resultant string of sub string built-in function
		String charAtSubStringResult  =   charAtSubString(str,start,end); // resultant string of charAt substring function 
		
		System.out.println("Substring using charAt(): " + charAtSubStringResult);
        System.out.println("Substring using substring(): " + builtInSubStringResult);
        
        boolean equal = charAtComparison(builtInSubStringResult,charAtSubStringResult);
        
        System.out.println("are the SubString results equal ? "+equal );   // print output

	}
	
	public static String charAtSubString(String str , int start, int end) {
		String subStringResult ="";
		for(int i=start;i<end  && i<str.length();i++) {
			subStringResult+=str.charAt(i);
		}
		return subStringResult;
	}
	
	public static boolean charAtComparison(String str1 , String str2) {       // charAt method 
		if(str1.length() != str2.length()) {             // condition for both lengths of string are not equal
			return false;
		}
		
		for(int i=0;i<str1.length();i++) {             // loop to check strings are equal
			if(str1.charAt(i) != str2.charAt(i)) {
				return false;
			}
		}
		
		return true;
	}

}
