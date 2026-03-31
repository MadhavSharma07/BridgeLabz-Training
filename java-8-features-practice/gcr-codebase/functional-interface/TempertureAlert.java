package functional_interface;

import java.util.function.Predicate;

public class TempertureAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  double threshold = 40.0;

	        // Predicate to check high temperature
	        Predicate<Double> highTemperatureAlert =
	                temp -> temp > threshold;

	        double currentTemp = 42.5;

	        if (highTemperatureAlert.test(currentTemp)) {
	            System.out.println("Alert : Temperature crossed threshold!");
	        } else {
	            System.out.println("Temperature is normal.");
	        }

	}

}
