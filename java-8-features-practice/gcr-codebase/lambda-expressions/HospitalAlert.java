package com.lambda_function;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.function.Predicate;

	class Alert {
	    String type;
	    String message;

	    Alert(String type, String message) {
	        this.type = type;
	        this.message = message;
	    }

	    @Override
	    public String toString() {
	        return type + " Alert: " + message;
	    }
	}

public class HospitalAlert {
	    public static void main(String[] args) {

	        List<Alert> alerts = new ArrayList<>();

	        alerts.add(new Alert("EMERGENCY", "Heart rate critical"));
	        alerts.add(new Alert("REMINDER", "Take blood pressure medicine"));
	        alerts.add(new Alert("APPOINTMENT", "Doctor visit at 5 PM"));
	        alerts.add(new Alert("EMERGENCY", "Oxygen level low"));

	        //User preference 
	        Predicate<Alert> emergencyFilter =
	                alert -> alert.type.equals("EMERGENCY");

	        System.out.println("Filtered Alerts ->");

	        // Apply Predicate using lambda
	        for (Alert alert : alerts) {
	            if (emergencyFilter.test(alert)) {
	                System.out.println(alert);
	            }
	        }
	    }
}

