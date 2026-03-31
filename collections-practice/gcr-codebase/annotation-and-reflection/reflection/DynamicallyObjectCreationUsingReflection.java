package reflection;

import java.lang.reflect.Constructor;

public class DynamicallyObjectCreationUsingReflection {
	public static void main(String []args) throws Exception {
		 Class<?> cl = Student.class;
		 Constructor<?> constructor = cl.getDeclaredConstructor(int.class,String.class);//get constructor
		 Student student = (Student) constructor.newInstance(01,"Madhav"); // create object 
		 student.display();  // display info
		
	}
}

class Student{  // Student class
	int rollNo;
	String name;
	
	Student(int rollNo,String name){  // constructor
		this.rollNo=rollNo;
		this.name =name;
	}
	
	public void display() { // method to print details
		System.out.println("Roll No -> "+rollNo);
		System.out.println("Name -> "+name);
	}
}
