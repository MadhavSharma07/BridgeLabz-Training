package oops.gcr-codebase.java-constructor;

public class UniversityManagement {
    public static void main(String[] args) {

        PostgraduateStudent pgStudent = new PostgraduateStudent(101, "Arjun", 8.6, "Computer Science");
               

        pgStudent.printPGStudentDetails();

        // Modifying CGPA using public method
        pgStudent.updateCGPA(8.9);

        System.out.println("\nAfter CGPA Update:");
        pgStudent.printPGStudentDetails();
    }
}

class Student {
    public int rollNumber;            // Public variable
    protected String name;         // Protected variable
    private double cgpa;                // Private variable

    
    public Student(int rollNumber, String name, double cgpa) {                // Constructor
        this.rollNumber = rollNumber; 
        this.name = name;
        this.cgpa = cgpa;
    }

    
    public double getCGPA() {          // method to get cgpa
        return cgpa;
    }

   
    public void setCGPA(double cgpa) {      //setter method to modify CGPA
        this.cgpa = cgpa;
    }

    
    public void printStudentDetails() {                  // Method to display student details
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}

// Subclass demonstrating protected member access
class PostgraduateStudent extends Student {

    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    public void printPGStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);   // public member
        System.out.println("Name: " + name);                 // protected member
        System.out.println("CGPA: " + getCGPA());            // private via method
        System.out.println("Specialization: " + specialization);
    }
}
