package oops-practice.gcr-codebase.java-inheritance;


class Person {          // Superclass

    String name;
    int age;

    
    Person(String name, int age) {        // constructor
        this.name = name;
        this.age = age;
    }

    
    void printInfo() {          // Common method to display information
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}


class Teacher extends Person { // subclass Teacher

    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void printRole() {         // method to print role of teacher
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}


class Student extends Person {  // subclass Student

    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void printRole() {        // method to print role of Student
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}


class Staff extends Person {      // subclass Staff

    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void printRole() { // method to print role of staff
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}


public class SchoolSystem {    // Main class

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student student = new Student("Amit", 16, "10th Grade");
        Staff staff = new Staff("Ramesh", 35, "Administration");

        System.out.println("Teacher Details:");
        teacher.printInfo();
        teacher.printRole();

        System.out.println("\nStudent Details:");
        student.printInfo();
        student.printRole();

        System.out.println("\nStaff Details:");
        staff.printInfo();
        staff.printRole();
    }
}

