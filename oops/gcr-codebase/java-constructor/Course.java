package oops.gcr-codebase.java-constructor;

public class Course {
    String courseName;
    int courseDuration;
    double courseFee;
    static String instituteName = "GLA Institute";

    Course(String courseName, int courseDuration, double courseFee) {         // constructor
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        this.courseFee = courseFee;
    }

   public void printCourseDetails() {          // method to display course details
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + courseDuration + " months");
        System.out.println("Fee: " + courseFee);
        System.out.println("Institute: " + instituteName);
    }

    public static void updateInstituteName(String newInstituteName) {   // method to update institute name
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        Course course1 = new Course("PythonProgramming", 6, 10000);    // create object course1
        Course course2 = new Course("Web Development", 3, 6000);     // create object course2
        
        course1.printCourseDetails();         // print course 1 deatails
        System.out.println();
        course2.printCourseDetails();
        System.out.println();     // print course2 details

        Course.updateInstituteName("SRM");    // update institute name ="SRM"

        course1.printCourseDetails();
        System.out.println();
        course2.printCourseDetails();
    }
}
