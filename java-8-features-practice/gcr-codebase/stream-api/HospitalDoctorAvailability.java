package stream_api;
import java.util.*;
import java.util.stream.Collectors;

public class HospitalDoctorAvailability {

	    public static void main(String[] args) {

	        List<Doctor> doctors = Arrays.asList(
	                new Doctor("Dr. Arjun", "Cardiology", true),
	                new Doctor("Dr. Neha", "Neurology", false),
	                new Doctor("Dr. Ravi", "Orthopedics", true),
	                new Doctor("Dr. Pooja", "Dermatology", true),
	                new Doctor("Dr. Kiran", "Neurology", true)
	        );

	        // Weekend available doctors sorted by specialty
	        List<Doctor> availableDoctors =
	                doctors.stream()
	                        .filter(Doctor::isAvailableOnWeekend)
	                        .sorted(Comparator.comparing(Doctor::getSpecialty))
	                        .collect(Collectors.toList());

	        // Display result
	        availableDoctors.forEach(d ->
	                System.out.println(
	                        d.getName() + " | " + d.getSpecialty()
	                )
	        );
	    }
	}


class Doctor {
    private String name;
    private String specialty;
    private boolean availableOnWeekend;

    Doctor(String name, String specialty, boolean availableOnWeekend) {
        this.name = name;
        this.specialty = specialty;
        this.availableOnWeekend = availableOnWeekend;
    }

    public String getSpecialty() {
        return specialty;
    }

    public boolean isAvailableOnWeekend() {
        return availableOnWeekend;
    }

    public String getName() {
        return name;
    }
}

