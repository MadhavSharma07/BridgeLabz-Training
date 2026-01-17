package reflection;

import java.lang.reflect.Field;

public class PrivateFieldUpdationUsingReflection {

	public static void main(String[] args) throws Exception{
		Person myPerson = new Person(10);  // person class object
		
		Field myAge = myPerson.getClass().getDeclaredField("age");  // get age field
		myAge.setAccessible(true);  // accessible to age private field
		System.out.println("Person's old age -> "+myAge.get(myPerson)); //print old age
		myAge.set(myPerson, 12);  // modify person's age
		System.out.println("Person's new age -> "+myAge.get(myPerson));  // print new age
		

	}

}

class Person{  // class person
	private int age ;  // private age
	
	Person(int age){
		this.age = age;
	}

	
	
 }
