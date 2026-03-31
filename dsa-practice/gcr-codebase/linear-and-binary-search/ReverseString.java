import java.util.*;


public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String string = sc.next(); // take string input from user
		StringBuilder reverseString = new StringBuilder(string);
		reverseString.reverse(); // reverse string
		System.out.println(reverseString.toString());  // print reverse string
	}
}