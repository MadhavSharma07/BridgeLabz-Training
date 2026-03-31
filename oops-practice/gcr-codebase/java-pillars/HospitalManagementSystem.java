package oops-practice.gcr-codebase.java-pillars;


interface MedicalRecord {      // interface MedicalRecord
    void addRecord(String record);
    void viewRecords();
}


abstract class Patient implements MedicalRecord { // abstract class Patient

    
    private int patientId; //   private variables
    private String name;
    private int age;

    
    private String diagnosis;
    private String medicalHistory;

    
    public Patient(int patientId, String name, int age) {                  // constructor
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    
    public int getPatientId() {  // Getter method to get patient id 
        return patientId;
    }

    public String getName() {    // getter method to get patient name
        return name;
    }

    public int getAge() {          // getter method to get patient age
        return age;
    }

    
    public void addRecord(String record) {  // override Medical record  interface methods
        this.medicalHistory = record;
    }

    public void viewRecords() {
        System.out.println("Medical History: " + medicalHistory);
    }

    
    public void setDiagnosis(String diagnosis) {  // Setter  method for diagnosis
        this.diagnosis = diagnosis;
    }

    
    public abstract double calculateBill();         // abstract method

    
    public void printPatientDetails() {      // Concrete method to print patient details
        System.out.println("Patient ID : " + patientId);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Diagnosis  : " + diagnosis);
    }
}


class InPatient extends Patient {// InPatient subclass extends Patient super class

    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(int id, String name, int age, int days, double charge) {     // InPatient subclass constructor
        super(id, name, age);
        this.daysAdmitted = days;
        this.dailyCharge = charge;
    }

    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }
}


class OutPatient extends Patient {  // OutPatient subclass extends Patient super class
 
    private double consultationFee;

    public OutPatient(int id, String name, int age, double fee) { // OutPatient subclass constructor
        super(id, name, age);
        this.consultationFee = fee;
    }

    public double calculateBill() {
        return consultationFee;
    }
}


public class HospitalManagementSystem {   // main class

    // Polymorphic method
    public static void displayBillingDetails(Patient patient) {
        patient.printPatientDetails();
        System.out.println("Total Bill : " + patient.calculateBill());
        patient.viewRecords();
        System.out.println("//////////////////////////");
    }

    public static void main(String[] args) {

        Patient patient1 = new InPatient(101, "Ravi", 45, 5, 2000); // create object patient 1
        Patient patient2 = new OutPatient(102, "Anjali", 30, 500);  // create object patient 2 

        patient1.setDiagnosis("Pneumonia");
        patient2.setDiagnosis("Fever");

        patient1.addRecord("Admitted for respiratory treatment");
        patient2.addRecord("General consultation and medication");

        Patient[] patients = { patient1, patient2 };

        System.out.println("Hospital Patient Billing Details:\n");

        for (Patient p : patients) {
            displayBillingDetails(p);
        }
    }
}

