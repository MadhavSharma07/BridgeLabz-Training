package stream_api;
import java.util.*;
import java.util.stream.Collectors;


public class TransformNames {

	    public static void main(String[] args) {

	        List<String> names = Arrays.asList(
	                "arjun", "neha", "ravi", "pooja", "kiran"
	        );

	        // Convert to uppercase and sort alphabetically
	        List<String> result =
	                names.stream()
	                        .map(String::toUpperCase)
	                        .sorted()
	                        .collect(Collectors.toList());

	        // Display
	        result.forEach(System.out::println);
	    }
	}

