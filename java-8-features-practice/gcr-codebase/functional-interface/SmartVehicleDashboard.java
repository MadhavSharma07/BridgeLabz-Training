package functional_interface;

interface SmartVehicle { // SmartVehicle interface

    void displaySpeed();

    // New feature added 
    default void displayBatteryPercentage() {
        System.out.println("Battery percentage not applicable");
    }
}

class Car implements SmartVehicle { // Car class using SmartVehicle interface

    @Override
    public void displaySpeed() {
        System.out.println("Car speed: 60 km/h");
    }
}

class ElectricCar implements SmartVehicle {  // Electric Car using SmartVehicle

    @Override
    public void displaySpeed() {
        System.out.println("Electric Car speed: 80 km/h");
    }

    @Override
    public void displayBatteryPercentage() {
        System.out.println("Battery: 85%");
    }
}



public class SmartVehicleDashboard {

	public static void main(String[] args) {
		SmartVehicle car = new Car();
		SmartVehicle electricCar = new ElectricCar();
		car.displaySpeed();
		car.displayBatteryPercentage(); // default method
		
		electricCar.displaySpeed();
		electricCar.displayBatteryPercentage(); // override method
		
		

	}

}
