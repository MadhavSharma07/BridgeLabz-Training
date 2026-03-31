package ocean_fleet;

import java.util.List;
import java.util.Scanner;

public class UserInterface { // main class

	public static void main(String[] args) {  // main method
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of vessels to be added ");
	int n = sc.nextInt();
	sc.nextLine();
	VesselUtil vesselUtil = new VesselUtil();
	while(n-- >0) {
		System.out.println("Enter vessel details");
		String str = sc.nextLine();
		
		String [] input = str.split(":");
		
		String vesselId = input[0];
		String vesselName = input[1];
		double averageSpeed = Double.parseDouble(input[2]);
		String vesselType = input[3];
		
		Vessel vessel = new Vessel(vesselId,vesselName,averageSpeed,vesselType);
		vesselUtil.addVesselPerformance(vessel);
		
		
	}
	
	System.out.println("Enter the Vessel Id to check speed");
	String vesselId = sc.next();
	Vessel vessel = vesselUtil.getVesselById(vesselId);
	if(vessel==null) {
		System.out.println("Vessel Id "+vesselId+" not found");
	}
	else {	
		System.out.println(vessel.getVesselId()+" |"+vessel.getVesselName()+" |"+vessel.getVesselType()+" |"+vessel.getAverageSpeed());
	}
	
	List<Vessel> v = vesselUtil.getHighPerformanceVessels();
	System.out.println("High performance vessels are ");
	for(int i =0; i < v.size(); i++) {
		
		
		System.out.println(v.get(i).getVesselId()+" |"+v.get(i).getVesselName()+" |"+v.get(i).getVesselType()+" |"+v.get(i).getAverageSpeed());
	}
		
		

	}

}
