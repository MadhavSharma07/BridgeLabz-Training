package oops-practice.gcr-codebase.java-inheritance;

class Animal{                           //parent class OR super class
	String name;
	int age;
	void makeSound() {         // method to print sounds
		System.out.println("Animal make sound");
	}
	Animal(String name, int age){
		this.name = name ;
		this.age = age;
	}
}


class Dog extends Animal{      //Child class Dog
	Dog(String name, int age){
		super(name , age);
	}
	void makeSound() {
		System.out.println("barks!");
	}
}


class Cat extends Animal{            // child class cat
	Cat(String name , int age){
		super(name,age);
	}
	void makeSound() {
		System.out.println("meows");
	}
}

class Bird extends Animal{          //child class bird
	Bird(String name , int age){
		super(name, age);
	}
	void makeSound() {
		System.out.println("sings");
	}
}

public class AnimalHierarchy {

	public static void main(String[] args) {
		Dog dog = new Dog("Tiger",7);
		Cat cat = new Cat("penny",3);
		Bird bird = new Bird("mew",2);
		System.out.print(dog.name + " is a dog of age " + dog.age+" and sounds ");
		dog.makeSound();
		System.out.print(cat.name + " is a cat of age " + cat.age+" and sounds ");
		cat.makeSound();
		System.out.print(bird.name + " is a bird of age " + bird.age+" and sounds ");
		bird.makeSound();
	}
}
