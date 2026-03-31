package oops-practice.gcr-codebase.java-inheritance;

class Vehicles{        // super class
	int maxSpeed;
	String model;
	Vehicles(int maxSpeed, String model){     // constructor
		this.maxSpeed=maxSpeed;
		this.model= model;
	}
}
interface Refuelable{       // interface
    void refuel();
}
class PetrolVehicle extends Vehicles implements Refuelable{       // subclass PetrolVehicle extends Super class Vechiles and using  Refuelable interface
	public boolean fuel;
	PetrolVehicle(int maxSpeed, String model,boolean fuel){    // constructor
		super(maxSpeed,model);
		this.fuel=fuel;
	}
	public void refuel() {
		if(fuel) {
			System.out.println("Model of vehicle is: "+ model);
			System.out.println("MaxSpeed of vehicle is: "+ maxSpeed);
			System.out.println("fill the tank of vehicle");
		}
		else {
			System.out.println("Model of vehicle is: "+ model);
			System.out.println("MaxSpeed of vehicle is: "+ maxSpeed);
			System.out.println("No need to fill the tank of vehicle");
		}
	}
	
}
class ElectricVehicle extends Vehicles{      // subclass ElectricVehicle extends Vechiles super class
	public boolean charge;
	ElectricVehicle(int maxSpeed, String model,boolean charge){
		super(maxSpeed,model);
		this.charge=charge;
	}
	public void charge() {
		if(charge) {
			System.out.println("Model of vehicle is: "+ model);
			System.out.println("MaxSpeed of vehicle is: "+ maxSpeed);
			System.out.println("Charge the vehicle");
		}
		else {
			System.out.println("Model of vehicle is: "+ model);
			System.out.println("MaxSpeed of vehicle is: "+ maxSpeed);
			System.out.println("No need to Charge the vehicle");
			
		}
	}
}
public class VehicleManagement {     // main class
	
	public static void main(String[] args) {
	 PetrolVehicle petrol = new PetrolVehicle(60, "splender",true);
	 petrol.refuel();
	 ElectricVehicle electric = new ElectricVehicle( 20, "Tata Nexon",true);
	 electric.charge();
	 
	}

}
