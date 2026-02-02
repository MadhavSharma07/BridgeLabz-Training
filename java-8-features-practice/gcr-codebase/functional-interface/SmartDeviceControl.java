package functional_interface;

interface SmartDevice{  // interface Smart Device
	void turnOn();
	void turnOff();
}

class Light implements SmartDevice{  // class Light using interface Smart Device
	
	@Override
	public void turnOn() {
		System.out.println("Light is turned on");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Light is turned off");
	}
}

class AC implements SmartDevice{ // class AC using interface Smart Device
	@Override
	public void turnOn() {
		System.out.println("AC is turned on");
	}
	
	@Override
	public void turnOff() {
		System.out.println("AC is turned off");
	}
}

class TV implements SmartDevice{   // class TV using interface Smart Device
	@Override
	public void turnOn() {
		System.out.println("TV is turned on");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV is turned off");
	}
}


public class SmartDeviceControl {  // main class

	public static void main(String[] args) {  // main method
		// TODO Auto-generated method stub
		
		Light device1  = new Light();
		SmartDevice device2  = new TV();
		SmartDevice device3  = new AC();
		
		
		device1.turnOn();
		device2.turnOn();
		device3.turnOn();
		
		device1.turnOff();
		device2.turnOff();
		device3.turnOff();
		
		
		
		

	}

}


