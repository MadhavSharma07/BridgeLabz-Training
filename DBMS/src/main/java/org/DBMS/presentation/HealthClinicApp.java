package org.DBMS.presentation;


import java.sql.Date;

import org.DBMS.model.Patient;
import org.DBMS.service.PatientService;

public class HealthClinicApp {

    public static void main(String[] args) {

        try {

            PatientService service = new PatientService();

            Patient patient = new Patient(
                    "Arjun",
                    Date.valueOf("1998-05-20"),
                    "9876543210",
                    "arjun@gmail.com",
                    "Delhi",
                    "O+"
            );

            service.registerPatient(patient);

            System.out.println("Patient Registered Successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
