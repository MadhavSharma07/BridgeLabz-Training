

import java.util.HashMap;
import java.util.Scanner;

public class RobotHazardAuditor {  
	
	static HashMap<String,Double> map = new HashMap<>();
	
	static {  // static block
		map.put("Worn", 1.3);
		map.put("Faulty", 2.0);
		map.put("Critical", 3.0);
	}

	public static void main(String[] args) { // main method
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Arm Precision (0.0 - 1.0): ");
		double armPrecision = sc.nextDouble();
		System.out.println("Enter Worker Density (1 - 20): ");
		int workerDensity = sc.nextInt();
		System.out.println("Enter Machinery State (Worn/Faulty/Critical):");
		String machineryState = sc.next();
		
		try {  // try block
			double hazardRisk= calculateHazardRisk(armPrecision, workerDensity, machineryState);
			System.out.println("Robot Hazard Risk Score: "+hazardRisk);  // print output
			
		}catch(RobotSafetyException e){  // catch custom exception
			System.out.println(e.getMessage());
		}

	}
	
	public static double calculateHazardRisk(double armPrecision, int workerDensity, String machineryState ) throws RobotSafetyException{ // method to calculate hazard risk score
		if(armPrecision < 0  || armPrecision >1.0) {
			throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0");
		}
		if(workerDensity<1 || workerDensity>20) {
			throw new RobotSafetyException("Error: Worker density must be 1-20");
		}
		if(!map.containsKey(machineryState)) {
			throw new RobotSafetyException("Error: Unsupported machinery state");
		}
		
		double machineRiskFactor = map.get(machineryState);
		
		double hazardRisk = ((1.0-armPrecision)*15.0) + (workerDensity*machineRiskFactor);
		
		return hazardRisk;
	}
	
	

}

class RobotSafetyException extends Exception{  // Custom Robot Safety Exception
	
	public  RobotSafetyException(String message) {
		super(message);
	}
}