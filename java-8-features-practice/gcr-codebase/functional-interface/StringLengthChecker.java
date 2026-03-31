package functional_interface;

import java.util.function.Function;

public class StringLengthChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int maxLimit = 20;

	        // Function to find length of a string
	        Function<String, Integer> lengthFunction =msg -> msg.length();

	        String message = "Hello Functional Interface";

	        int length = lengthFunction.apply(message);

	        if (length > maxLimit) {
	            System.out.println("Message exceeds character limit");
	        } else {
	            System.out.println("Message is within limit");
	        }

	        System.out.println("Length: " + length);
	}

}
