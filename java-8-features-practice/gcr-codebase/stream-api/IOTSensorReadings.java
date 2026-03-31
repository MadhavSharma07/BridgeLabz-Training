package stream_api;
import java.util.*;

public class IOTSensorReadings {
	    public static void main(String[] args) {

	        List<Double> sensorReadings = Arrays.asList(
	                22.5, 45.0, 30.2, 55.8, 18.9, 60.4
	        );

	        double threshold = 40.0;

	        System.out.println("Sensor readings above threshold:");

	        // Stream + filter + forEach
	        sensorReadings.stream()
	                .filter(reading -> reading > threshold)
	                .forEach(reading ->
	                        System.out.println("Alert Reading: " + reading)
	                );
	    }
	}


