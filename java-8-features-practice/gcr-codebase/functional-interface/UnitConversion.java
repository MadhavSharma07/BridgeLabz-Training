package functional_interface;



interface UnitConverter {  // interface Unit Converter
	
    static double kmToMiles(double km) {//static method to convert km to miles
        return km * 0.621371;
    } 
    static double kgToPounds(double kg) {//method to convert kg to pounds
        return kg * 2.20462;
    }
}


public class UnitConversion {  // main class

	public static void main(String[] args) {
		double distanceKm = 120;
        double weightKg = 50;

        System.out.println("Distance in miles: "+ UnitConverter.kmToMiles(distanceKm));// print output

        System.out.println("Weight in pounds: "+ UnitConverter.kgToPounds(weightKg)); // print output

	}

}
