
import java.util.*;

abstract class CourseType {  // abstract class CourseType
    private String title;
    private String instructor;

    public CourseType(String title, String instructor) {   // constructor
        this.title = title;
        this.instructor = instructor;
    }

    public String getTitle() {
        return title;
    }

    public String getInstructor() {
        return instructor;
    }

    public abstract String getEvaluationMethod();  // abstarct method
}

class ExamCourse extends CourseType {  // class ExamCourse exteands abstract class CourseType
    public ExamCourse(String title, String instructor) {
        super(title, instructor);
    }

    @Override
    public String getEvaluationMethod() {
        return "Exam-Based Evaluation";
    }
}

class AssignmentCourse extends CourseType {// class AssignmentCourse exteands abstract class CourseType
    public AssignmentCourse(String title, String instructor) {
        super(title, instructor);
    }

    @Override
    public String getEvaluationMethod() {
        return "Assignment-Based Evaluation";
    }
}

class ResearchCourse extends CourseType {// class ResearchCourse exteands abstract class CourseType
    public ResearchCourse(String title, String instructor) {
        super(title, instructor);
    }

    @Override
    public String getEvaluationMethod() {
        return "Research-Based Evaluation";
    }
}

class Course<T extends CourseType> {  // generic class Course
    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public T getCourseType() {
        return courseType;
    }

    public String getCourseDetails() {
        return courseType.getTitle() + " | Instructor: " + courseType.getInstructor() +
               " | Evaluation: " + courseType.getEvaluationMethod();
    }
}

class CourseUtil {  // utility class to print course type
    public static void displayCourses(List<? extends CourseType> courses) {  //generic method and use upper bound to read only
        for (CourseType c : courses) {
            System.out.println(c.getTitle() + " - " + c.getEvaluationMethod() +
                               " (Instructor: " + c.getInstructor() + ")");
        }
    }
}

public class CourseManagementSystem {  // main class
    public static void main(String[] args) {
        Course<ExamCourse> python = new Course<>(new ExamCourse("Python", "Dr. Sharma"));
        Course<AssignmentCourse> java = new Course<>(new AssignmentCourse("Java", "Ms. Roy"));
        Course<ResearchCourse> c = new Course<>(new ResearchCourse("C", "Dr. Batra"));

        List<CourseType> courseList = new ArrayList<>();
        courseList.add(python.getCourseType());
        courseList.add(java.getCourseType());
        courseList.add(c.getCourseType());

        System.out.println("All University Courses:");
        CourseUtil.displayCourses(courseList);  // print courses
    }
}
