
class Employee {
 
    String name;
    int id;
    double salary;

    Employee(String name, int id ,double salary){
        this.name = name;
        this.id = id;
        this.salary= salary;
    }

    public void displayDeatails(){
        System.out.println("The name of employee is: "+name);
        System.out.println("The id of emplyee is: "+id);
        System.out.println("The salary of employee is: " +salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Rohan", 1, 500000);

        employee.displayDeatails();
    }
    
}