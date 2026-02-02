package smart_city_transport;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

interface TransportService{
	 default void printServiceDetails() {
		 System.out.println("");
	 }
}

interface GeoUtils{
	
	static int calculateDistance() {
		return 10;
	}
}

class BusService implements TransportService {
	private LocalDateTime departureTime;
	private double fare;
	
	BusService(LocalDateTime departureTime,double fare){
		this.departureTime = departureTime;
		this.fare = fare;
	}
	
	public LocalDateTime getDepartureTime() {
		return departureTime;
	}
	
	public double getFare() {
		return fare;
	}
	@Override
	public void printServiceDetails() {
		System.out.println("Departure Time -> "+departureTime);
		System.out.println("Amount ->" +fare);
	}
	
}

class MetroService implements TransportService{
	private LocalDateTime departureTime;
	private double fare;
	
	MetroService(LocalDateTime departureTime,double fare){
		this.departureTime = departureTime;
		this.fare = fare;
	}
	
	public LocalDateTime getDepartureTime() {
		return departureTime;
	}
	
	public double getFare() {
		return fare;
	}
	@Override
	public void printServiceDetails() {
		System.out.println("Departure Time -> "+departureTime);
		System.out.println("Amount ->" +fare);
	}
}

class TaxiService implements TransportService{
	private LocalDateTime departureTime;
	private double fare;
	
	TaxiService(LocalDateTime departureTime,double fare){
		this.departureTime = departureTime;
		this.fare = fare;
	}
	
	public LocalDateTime getDepartureTime() {
		return departureTime;
	}
	
	public double getFare() {
		return fare;
	}
	@Override
	public void printServiceDetails() {
		System.out.println("Departure Time -> "+departureTime);
		System.out.println("Amount ->" +fare);
	}
	
}

public class SmartCityManagement {

	public static void main(String[] args) {
		List<BusService> bus = new ArrayList<>();
		List<MetroService> metro = new ArrayList<>();
		List<TaxiService> taxi = new ArrayList<>();
		
		
	}
	
	public static  void filter(List<BusService> bus,List<MetroService> metro,List<TaxiService> taxi,String type) {
		if(type.equalsIgnoreCase("time")) {
			bus.sort((t1,t2)->(t1.getDepartureTime().compareTo(t2.getDepartureTime())));
			metro.sort((t1,t2)->(t1.getDepartureTime().compareTo(t2.getDepartureTime())));
			taxi.sort((t1,t2)->(t1.getDepartureTime().compareTo(t2.getDepartureTime())));
		}
	}
	
}
