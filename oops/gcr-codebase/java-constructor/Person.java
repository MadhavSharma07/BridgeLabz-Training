package oops.gcr-codebase.java-constructor;

class Person {
    int age;
    String name;

    Person(int age,String name){             // parameterised constructor
        this.age = age;
        this.name = name;
    }
 
    Person(Person a){       // copy constructor
        this.age = a.age;
        this.name = a.name;
    }
     public void print(){       // method to print age and name
        System.out.println("The name of person is:"+name);
        System.out.println("The age of person is:"+age);
    }
     public static void main(String[] args) {
        Person parameterisedPerson = new Person(225878,"Aditya");  // create object and calling paramterised constructor 
        System.out.println("Person information using parameter constructor-");
        parameterisedPerson.print();
        Person copyPerson = new Person(parameterisedPerson);     // create object and calling copy constructor
        System.out.println("Person info using copy constructor-");
        copyPerson.print();
    }

}
