package annotations;

public class OverrideAnnotaion {  // main class

	public static void main(String[] args) {
		Dog dog = new Dog();  // dog class  object
		dog.makeSound();  // call override sound method

	}

}


class Animal{  // Animal class
	void makeSound() {  // sound method
		System.out.println("Animal Sound");
	}
}


class Dog extends Animal{ // class dog extends Animal class
	
	@Override   // override annotation 
	void makeSound() {  // override sound method
		System.out.println("Dog barks");
	}
}