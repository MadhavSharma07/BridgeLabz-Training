package oops-practice.gcr-codebase.java-inheritance;


interface Department {       // Interface for Department
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}


abstract class Employee implements Department {   // Abstract Employee class

    
    private int employeeId;  // Encapsulated variables
    private String name;
    private double baseSalary;
    private String department;

    
    public Employee(int employeeId, String name, double baseSalary) {       //constructor
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    
    public int getEmployeeId() {  // Getter method to  get employee id
        return employeeId;
    }

    public String getName() {  // Getter method to  get employee name
        return name;
    }

    public double getBaseSalary() { // Getter method to  get employee base salary
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) { //setter method to  get base salary
        this.baseSalary = baseSalary;
    }

    
    public void assignDepartment(String deptName) { // Department interface methods
        this.department = deptName;
    }

    public String getDepartmentDetails() {
        return department;
    }

    
    public abstract double calculateSalary(); // abstract method

    
    public void printDetails() {          // Concrete method to display details 
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + calculateSalary());
    }
}


class FullTimeEmployee extends Employee {  // FullTimeEmployee  child class extends Employee abstract class

    public FullTimeEmployee(int id, String name, double salary) {    // constructor
        super(id, name, salary);
    }

    
    public double calculateSalary() {  // fixed salary implementation
        return getBaseSalary();
    }
}


class PartTimeEmployee extends Employee { //PartTimeEmployee subclass extends Employee abstract class

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, double rate, int hours) {
        super(id, name, 0);
        this.hourlyRate = rate;
        this.hoursWorked = hours;
    }

    
    public double calculateSalary() { // salary of part timr employee based on hours
        return hourlyRate * hoursWorked;
    }
}

public class EmployeeManagementSystem { // main class

    public static void main(String[] args) {

        
        Employee employee1 = new FullTimeEmployee(1, "Sarthak", 50000);     //create object employee1
        Employee employee2 = new PartTimeEmployee(2, "Shivam", 500, 40); // create object employee 2

        employee1.assignDepartment("HR");
        employee2.assignDepartment("IT");

        Employee[] employees = { employee1, employee2 };

        System.out.println("Employee Details:\n");

        for (Employee emp : employees) {
            emp.printDetails();
            System.out.println("      ");
        }
    }
}

