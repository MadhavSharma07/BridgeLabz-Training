package smart_city_transport;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


@FunctionalInterface
interface FareCalculator{  // Functional interface
	double calculateFare(int distance);
}

interface TransportService{
	 default void printServiceDetails() {
		 System.out.println("Tansport Services");
	 }
}

interface GeoUtils{  // GeoUtils interface
	
	static int calculateDistance(List<Integer> stop,int start, int end) {
		int distance=0;
		for(int i=start;i<=end;i++) {
			distance+=i;
		}
		
		return distance;
	}
}

class BusService implements TransportService , FareCalculator {  // class Bus Service using Transport Service and FareCalculator interface
	private String name;
	private LocalDateTime departureTime;
	private double fare;
	
	BusService(String name,LocalDateTime departureTime,double fare){
		this.name =name;
		this.departureTime = departureTime;
		this.fare = fare;
	}
	
	public String getName() {
		return  name;
	} 
	public LocalDateTime getDepartureTime() {
		return departureTime;
	}
	
	public double getFare() {
		return fare;
	}
	@Override
    public void printServiceDetails() {
        System.out.println("Bus -> Time: " + departureTime + " | Fare: " + fare);
    }
	
	
	@Override
	public double calculateFare(int distance) {
		return fare*distance;
	}
	
	
}

class MetroService implements TransportService, FareCalculator{//class Metro Service using Transport Service and FareCalculator interface
	private String name;
	private LocalDateTime departureTime;
	private double fare;
	
	MetroService(String name,LocalDateTime departureTime,double fare){
		this.name =name;
		this.departureTime = departureTime;
		this.fare = fare;
	}
	public String getName() {
		return  name;
	} 
	public LocalDateTime getDepartureTime() {
		return departureTime;
	}
	
	public double getFare() {
		return fare;
	}
	@Override
    public void printServiceDetails() {
        System.out.println("Metro -> Time: " + departureTime + " | Fare: " + fare);
    }
	
	@Override
	public double calculateFare(int distance) {
		return fare*distance;
	}
}

class TaxiService implements TransportService , FareCalculator{  // class Taxi Service using Transport Service and FareCalculator interface
	private String name;
	private LocalDateTime departureTime;
	private double fare;
	
	TaxiService(String name,LocalDateTime departureTime,double fare){
		this.name = name;
		this.departureTime = departureTime;
		this.fare = fare;
	}
	public String getName() {
		return  name;
	} 
	
	public LocalDateTime getDepartureTime() {
		return departureTime;
	}
	
	public double getFare() {
		return fare;
	}
	@Override
    public void printServiceDetails() {
        System.out.println("Taxi ->  Time: " + departureTime + " | Fare: " + fare);
    }
	
	@Override
	public double calculateFare(int distance) {
		return fare*distance;
	}
	
}

public class SmartCityManagement {  // main class

	public static void main(String[] args) {  // main method
		Scanner sc = new Scanner(System.in);
		
		List<BusService> bus = new ArrayList<>();
		List<MetroService> metro = new ArrayList<>();
		List<TaxiService> taxi = new ArrayList<>();
		List<Integer> stops = Arrays.asList(12,15,22,30,32,37,40);  // stops array
		// add data
		 bus.add(new BusService("Bus1",LocalDateTime.now().plusMinutes(30), 30));  
	     bus.add(new BusService("Bus2",LocalDateTime.now().plusMinutes(10), 25));
	     metro.add(new MetroService("Metro1",LocalDateTime.now().plusMinutes(20), 5));
	     metro.add(new MetroService("Metro2",LocalDateTime.now().plusMinutes(5), 7));
	     taxi.add(new TaxiService("Taxi1",LocalDateTime.now().plusMinutes(15), 50));
	     taxi.add(new TaxiService("Taxi2",LocalDateTime.now().plusMinutes(2), 35));
	     
	     while(true) {
	    	 System.out.println("\tEnter choice");
	    	 System.out.println("\t1. Dashboard");
	    	 System.out.println("\t2. Filter by time");
	    	 System.out.println("\t3. Filter by fare");
	    	 System.out.println("\t4. Booking Transport(Bus,Metro,Taxi)");
	    	 int choice = sc.nextInt();
	    	 
	    	 switch(choice) {
	    	 
	    	 case 1:
	    		System.out.println("---- Bus Services ----");
	 	        bus.forEach(BusService::printServiceDetails);  // print details

	 	        System.out.println("---- Metro Services ----");
	 	        metro.forEach(MetroService::printServiceDetails);

	 	        System.out.println("---- Taxi Services ----");
	 	        taxi.forEach(TaxiService::printServiceDetails);
	 	        
	 	        break;
	 	        
	    	 case 2:
	    		 filter(bus,metro,taxi,"Time");  // filter by time
	    		 System.out.println("---- Bus Services ----");
		 	     bus.forEach(BusService::printServiceDetails);
		 	     System.out.println("---- Metro Services ----");
		 	     metro.forEach(MetroService::printServiceDetails);
		 	     System.out.println("---- Taxi Services ----");
		 	     taxi.forEach(TaxiService::printServiceDetails);
		 	        
		 	     break;
		 	     
	    	 case 3:
	    		 filter(bus,metro,taxi,"fare");  // filter by fare amount
	    		 System.out.println("---- Bus Services ----");
		 	     bus.forEach(BusService::printServiceDetails);
		 	     System.out.println("---- Metro Services ----");
		 	     metro.forEach(MetroService::printServiceDetails);
		 	     System.out.println("---- Taxi Services ----");
		 	     taxi.forEach(TaxiService::printServiceDetails);
		 	        
		 	     break;
		 	     
		 	     
	    	 case 4:
	    		 //Booking transport service
	    		 System.out.println("Select transport type(Bus, Metro & Taxi)");
	    		 String type = sc.next();
	    		 for(int i=0;i<stops.size();i++) {
	    			 System.out.println("Stop "+(i+1)+" distance - "+stops.get(i));
	    		 }
	    		 System.out.println("Starting stop:");
	    		 int start = sc.nextInt();
	    		 System.out.println("Ending stop :");
	    		 int end = sc.nextInt();
	    		 
	    		 if(type.equalsIgnoreCase("Bus")) {
	    			 System.out.println("---Bus Services---");
	    			 bus.forEach(BusService::printServiceDetails);
	    			 System.out.println("Enter the bus number ");
	    			 int number = sc.nextInt();
	    			 BusService busService = bus.get(number-1);
	    			 System.out.println("Total Fare : "+busService.calculateFare(GeoUtils.calculateDistance(stops, start, end)));
	    			 
	    			 
	    		 }
	    		 else if(type.equalsIgnoreCase("Metro")) {
	    			 System.out.println("---- Metro Services ----");
			 	     metro.forEach(MetroService::printServiceDetails);
			 	    System.out.println("Enter the Metro number ");
	    			 int number = sc.nextInt();
	    			 MetroService metroService = metro.get(number-1); 
	    			 System.out.println("Total Fare : "+metroService.calculateFare(GeoUtils.calculateDistance(stops, start, end)));
	    		 }
	    		 else {
	    			 System.out.println("---- Taxi Services ----");
			 	     taxi.forEach(TaxiService::printServiceDetails);
			 	    System.out.println("Enter the taxi number ");
	    			 int number = sc.nextInt();
	    			 TaxiService taxiService = taxi.get(number-1);
	    			 System.out.println("Total Fare : "+taxiService.calculateFare(GeoUtils.calculateDistance(stops, start, end)));
			 	        
	    		 }
	    		 break;
	    		 
	    		 
	    		default :
	    			System.out.println("Invliad input");
	    			break;
	    			 
	    	 }	 
	    	 
	     }	
		
	}
	
	public static  void filter(List<BusService> bus,List<MetroService> metro,List<TaxiService> taxi,String type) { // sorting by departure time and fare amount
		if(type.equalsIgnoreCase("time")) {  // sorting by departure time
			bus.sort((t1,t2)->(t1.getDepartureTime().compareTo(t2.getDepartureTime())));
			metro.sort((t1,t2)->(t1.getDepartureTime().compareTo(t2.getDepartureTime())));
			taxi.sort((t1,t2)->(t1.getDepartureTime().compareTo(t2.getDepartureTime())));
		}
		else if(type.equalsIgnoreCase("fare")) {  // sorting by fare amount
			bus.sort((t1,t2)->Double.compare(t1.getFare(), t2.getFare()));
			metro.sort((t1,t2)->Double.compare(t1.getFare(), t2.getFare()));
			taxi.sort((t1,t2)->Double.compare(t1.getFare(), t2.getFare()));
		}
	}
	
}
