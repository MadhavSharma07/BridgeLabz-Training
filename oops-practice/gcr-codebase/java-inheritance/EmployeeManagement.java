package oops-practice.gcr-codebase.java-inheritance;

class EmployeeDetails{           // parent class 
	String name;        
	int id;
	double salary;
	EmployeeDetails(String name, int id, double salary ){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	 void printDetails() {
		System.out.println("The name of employee is :"+name);
		System.out.println("The id of employee is:"+id);
		System.out.println("The salary of employee is:"+salary);
			
	}
	 
}

class ManagerDetails extends EmployeeDetails{     // child class Manager details 
	int teamSize;
	ManagerDetails(String name, int id, double salary,int teamSize){
		super(name,id,salary);
		this.teamSize = teamSize;
		
	}
	void printDetails() {
		System.out.println("The name of manager is :"+name);
		System.out.println("The id of manager is:"+id);
		System.out.println("The salary of manager is:"+salary);
		System.out.println("The teamsize of manager is:"+teamSize);
			
	}
}

class Developer extends EmployeeDetails{          // child class Developer
	String programmingLanguage;
	Developer(String name, int id, double salary,String programmingLanguage){
		super(name,id,salary);
		this.programmingLanguage = programmingLanguage;
	}
	 void printDetails() {
			System.out.println("The name of developer is :"+name);
			System.out.println("The id of developer is:"+id);
			System.out.println("The salary of developer is:"+salary);
			System.out.println("The programming language of developer is:"+programmingLanguage);
				
		}
}

class Intern extends EmployeeDetails{        // child class Intern
	
	Intern(String name, int id, double salary){
		super(name,id,salary);
		
	}
	 void printDetails() {
			System.out.println("The name of intern is :"+name);
			System.out.println("The id of intern is:"+id);
			System.out.println("The salary of intern is:"+salary);
			
			
		}
}

public class EmployeeManagement {


	public static void main(String[] args) {
		ManagerDetails manager = new ManagerDetails("Aditya",321,100000,12345); // create object manager of subclass MangerDetails
		Developer developer = new Developer("Shivam",654,50000,"Java"); // create object developer of suibclass Developer
		Intern intern = new Intern("Madhav",98,30000);  // create object intern  of subclass Intern
		
		manager.printDetails();   //display details of manager
		developer.printDetails();  // display details of developer
		intern.printDetails(); // display details of intern
		
	}

}