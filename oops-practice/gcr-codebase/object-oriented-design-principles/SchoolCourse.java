package oops-practice.gcr-codebase.object-oriented-design-principles;

import java.util.*;


class Course {  // Course class (associated with Student)

    private String courseName;
    private ArrayList<Student> students;

    public Course(String courseName) {  // constructor
        this.courseName = courseName;
        this.students = new ArrayList<Student>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
        System.out.println();
    }
}


class Student {  // Student class

    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {       // student class constructor 
        this.name = name;
        this.courses = new ArrayList<Course>();
    }

    public String getName() {
        return name;
    }

    
    public void enrollCourse(Course course) {  // association method
        courses.add(course);
        course.addStudent(this);
    }

    public void viewCourses() {
        System.out.println("Courses taken by " + name + ":");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
        System.out.println();
    }
}


class School {  // School class (aggregates students)

    private String schoolName;
    private ArrayList<Student> students;

    public School(String schoolName) {  // School class constructor
        this.schoolName = schoolName;
        this.students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
        System.out.println();
    }
}


public class SchoolCourse {  // main class

    public static void main(String[] args) {

        School school = new School("DPS");

        Student student1 = new Student("Amit");  // create student objects
        Student student2 = new Student("Neha");

        Course course1 = new Course("Mathematics");  // create course objects
        Course course2 = new Course("Computer Science");
        Course course3 = new Course("Physics");

        school.addStudent(student1);
        school.addStudent(student2);

        student1.enrollCourse(course1);
        student1.enrollCourse(course2);

        student2.enrollCourse(course2);
        student2.enrollCourse(course3);

        school.displayStudents();

        student1.viewCourses();
        student2.viewCourses();

        course2.displayStudents();
        course3.displayStudents();
    }
}
