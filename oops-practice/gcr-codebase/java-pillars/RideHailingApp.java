package oops-practice.gcr-codebase.java-pillars;



interface GPS {         // interface GPS
    String getCurrentLocation();
    void updateLocation(String newLocation);
}


abstract class Vehicle implements GPS {// Abstract Vehicle class

   
    private int vehicleId;     // private variables
    private String driverName;
    private double ratePerKm;
    private String location;

   
    public Vehicle(int vehicleId, String driverName, double ratePerKm) {  // constructor
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.location = "Unknown";
    }

  
    public int getVehicleId() {  // getter methods
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

   
    public String getCurrentLocation() {  // GPS interface methods
        return location;
    }

    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }

    
    public abstract double calculateFare(double distance);  // abstract method

    
    public void printVehicleDetails() {   // Concrete method to priint vechile details
        System.out.println("Vehicle ID   : " + vehicleId);
        System.out.println("Driver Name  : " + driverName);
        System.out.println("Rate per Km  : " + ratePerKm);
        System.out.println("Location     : " + location);
    }
}


class Car extends Vehicle {  // Car subclass extends Vechile

    public Car(int id, String driver, double rate) {   // constructor
        super(id, driver, rate);
    }

    public double calculateFare(double distance) { // override abstract method to calculate fare
        return distance * getRatePerKm();
    }
}


class Bike extends Vehicle { // Bike subclass extends Vechile

    public Bike(int id, String driver, double rate) {   // Bike class constructor
        super(id, driver, rate);
    }

    public double calculateFare(double distance) { // override abstract method to calculate fare
        return distance * getRatePerKm();
    }
}


class Auto extends Vehicle {  // Auto subclass extends Vechile super class

    public Auto(int id, String driver, double rate) { // Auto subclass constructor 
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}


public class RideHailingApp {// Main class

    
    public static void calculateAndPrintFare(Vehicle vehicle, double distance) { // method to get and print fare

        vehicle.printVehicleDetails();
        double fare = vehicle.calculateFare(distance);

        System.out.println("Distance     : " + distance + " km");
        System.out.println("Total Fare   : " + fare);
        System.out.println("////////////////////////");
    }

    public static void main(String[] args) {

        Vehicle vechile1 = new Car(1, "Rohit", 15);
        Vehicle vechile2 = new Bike(2, "Aman", 8);
        Vehicle vechile3 = new Auto(3, "Suresh", 10);

        vechile1.updateLocation("City Center");
        vechile2.updateLocation("Railway Station");
        vechile3.updateLocation("Bus Stand");

        Vehicle[] vehicles = { vechile1, vechile2, vechile3 };

        double tripDistance = 12.5;

        System.out.println("Ride Fare Details:\n");

        for (Vehicle v : vehicles) {
            calculateAndPrintFare(v, tripDistance);
        }
    }
}
