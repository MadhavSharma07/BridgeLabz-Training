package stream_api;
import java.util.*;

public class EventAttendance {

	    public static void main(String[] args) {

	        List<String> attendees = Arrays.asList(
	                "Arjun", "Neha", "Ravi", "Pooja", "Kiran"
	        );

	        // forEach with lambda to print welcome message
	        attendees.forEach(name ->
	                System.out.println("Welcome to the event, " + name + "!")
	        );
	    }
	}

