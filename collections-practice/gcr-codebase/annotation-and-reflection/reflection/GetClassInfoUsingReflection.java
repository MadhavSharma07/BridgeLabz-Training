package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetClassInfoUsingReflection {

	public static void main(String[] args) {
		Cat myCat = new Cat("Aditya",5000);//  class Cat object myCat
		
		Field [] myfield = myCat.getClass().getDeclaredFields();  // store fields
		System.out.println("Fields are -> ");
		for(Field field : myfield) {
			System.out.println(field.getName());  // print fields
		}
		
		Method []methods = myCat.getClass().getDeclaredMethods();  // store methods
		
		System.out.println("Methods are -> ");
		for(Method method : methods) {
			System.out.println(method.getName());  // print method name
		}
		
		Constructor []constructors = myCat.getClass().getDeclaredConstructors();// store constructor
		System.out.println("Constructor are -> ");
		
		for(Constructor constructor : constructors) {
			System.out.println(constructor.getDeclaringClass().getSimpleName());// print constructor
		}
		

	}

}


class Cat{  // class Cat
	String name;
	int age;
	
	Cat(String name,int age){  // constructor
		this.name = name;
		this.age = age;
	}
	
	public void sound() {  // method sound
		System.out.println("Meow");
	}
}
