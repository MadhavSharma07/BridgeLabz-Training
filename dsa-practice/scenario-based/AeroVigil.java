package aerovigil;

import java.util.HashMap;
import java.util.Scanner;

public class AeroVigil {  // main class
	 static HashMap<String,Integer> passengerCapacity= new HashMap<>();
	 static HashMap<String,Double> fuelCapacity= new HashMap<>();
	 static {   // static block
		 passengerCapacity.put("SpiceJet",396);
		 passengerCapacity.put("Vistara", 615);
		 passengerCapacity.put("IndiGo", 230);
		 passengerCapacity.put("Air Arabia", 130);
		 
		 fuelCapacity.put("SpiceJet",200000.0);
		 fuelCapacity.put("Vistara", 300000.0);
		 fuelCapacity.put("IndiGo", 250000.0);
		 fuelCapacity.put("Air Arabia", 150000.0);
		 
	 }
	
	public static void main(String[] args) throws InvalidFlightException{  // main method	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the flights details");
		String str = sc.nextLine();
		String [] input = str.split(":");
		String flightNumber = input[0];
		String flightName = input[1];
		int passengerCount = Integer.parseInt(input[2]);
		double currentFuelLevel = Double.parseDouble(input[3]);
		try {
			if(validateFlightNumber(flightNumber) && validateFlightName(flightName) && validatePassengerCount(passengerCount, flightName) ) {
				System.out.println("Fuel required to fill the tank: "+calculateFuelToFillTank(flightName, currentFuelLevel)+" liters");   // print output
			}
		}catch(InvalidFlightException e) {  // catch block
			System.out.println(e.getMessage());
		}
				
	}
	
	public static boolean validateFlightNumber(String flightNumber) throws InvalidFlightException {  // method to validate flight number
		if(!flightNumber.matches("FL-[1-9][0-9]{3}")) {
			throw new InvalidFlightException("The flight number "+flightNumber+" is invalid");
		}
		return true;
	}
	 
	public static boolean validateFlightName(String flightName) throws InvalidFlightException{  // method to validate flight name
		if(passengerCapacity.containsKey(flightName)) {
			return true;
		}
		
		 throw new InvalidFlightException("The flight name "+flightName+" is invalid");
	}
	
	public static boolean validatePassengerCount(int passengerCount,String flightName) throws InvalidFlightException { // method to validate passenger count
		if(!passengerCapacity.containsKey(flightName)) {
			 throw new InvalidFlightException("The passenger count " + passengerCount +" is invalid for " + flightName);
		}
		int maxCount = passengerCapacity.get(flightName);
		
		if(passengerCount<0 || passengerCount>maxCount) {
			 throw new InvalidFlightException("The passenger count " + passengerCount +" is invalid for " + flightName);
		}
		
		return true;
	}
	
	public static double calculateFuelToFillTank(String flightName , double currentFuelLevel ) throws InvalidFlightException {  // method to calculate current fuel level
		if(!fuelCapacity.containsKey(flightName)) {
			throw new InvalidFlightException("Invalid fuel level for "+flightName);
		}
		
		double maxCount = fuelCapacity.get(flightName);
		if(currentFuelLevel<0 || currentFuelLevel>maxCount) {
			throw new InvalidFlightException("Invalid fuel level for "+flightName);
		}
		
		return maxCount-currentFuelLevel;
		
	}

}

class InvalidFlightException extends Exception{  // custom exception
	
	public InvalidFlightException(String message) {
		super(message);
	}
}
