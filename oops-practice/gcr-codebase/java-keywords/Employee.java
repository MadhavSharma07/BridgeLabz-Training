public class Employee {

    
    static String companyName = "GLA University";  // Static variable shared by all employees
    private static int totalEmployees = 0;

    
    private String employeeName;  // Instance variables 
    private String employeeDesignation;

    
    private final int id;  // Final variable

    
    public Employee(int id, String employeeName, String employeeDesignation) {// Constructor
        this.id = id;
        this.employeeName = employeeName;
        this.employeeDesignation = employeeDesignation;
        totalEmployees++;
    }

    
    public static void printTotalEmployees() {// Static method to display total employees
        System.out.println("Total Employees: " + totalEmployees);
    }

    
    public void printDetails() {       // Method to display employee details
        System.out.println("Company Name : " + companyName);
        System.out.println("Employee ID  : " + id);
        System.out.println("Name         : " + employeeName);
        System.out.println("Designation  : " + employeeDesignation);
    }

    
    public static void main(String[] args) {

        Employee empployee1 = new Employee(201, "Amit", "Developer");
        Employee employee2 = new Employee(202, "Neha", "Tester");

        
        if (empployee1 instanceof Employee) {      //instanceof check before printing details
            System.out.println("\nEmployee 1 Details:");
            empployee1.printDetails();
        }

        if (employee2 instanceof Employee) {
            System.out.println("\nEmployee 2 Details:");
            employee2.printDetails();
        }

        
        Employee.printTotalEmployees();           // print total number of employees
    }
}
