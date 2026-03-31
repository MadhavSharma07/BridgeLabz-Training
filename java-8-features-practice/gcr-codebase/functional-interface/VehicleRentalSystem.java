package functional_interface;


interface Vehicle{  // interface Vehicle
	void rent();
	void returnVehicle();
}

class Bike implements Vehicle{  // class Bike using Vehicle interface
	@Override
	public void rent() {
		System.out.println("Bike rented");
	}
	
	@Override
	public void returnVehicle() {
		System.out.println("Bike returned");
	}
}

class Car implements Vehicle{  // class Car using Vehicle interface
	@Override
	public void rent() {
		System.out.println("Car rented");
	}
	
	@Override
	public void returnVehicle() {
		System.out.println("Car returned");
	}
}

class Bus implements Vehicle{  // class Bus using Vehicle interface
	@Override
	public void rent() {
		System.out.println("Bus rented");
	}
	
	@Override
	public void returnVehicle() {
		System.out.println("Bus returned");
	}
}

public class VehicleRentalSystem {  // main class

	public static void main(String[] args) {  // main method
		Vehicle bike = new Bike();
		Vehicle car = new Car();
		Vehicle bus = new Bus();
		
		bike.rent();
		car.rent();
		bus.rent();
		
		bike.returnVehicle();
		car.returnVehicle();
		bus.returnVehicle();

	}

}
