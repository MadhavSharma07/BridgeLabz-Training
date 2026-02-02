package collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentResultGrouping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Student> students = Arrays.asList(
	                new Student("Arjun", "A"),
	                new Student("Neha", "B"),
	                new Student("Ravi", "A"),
	                new Student("Pooja", "C"),
	                new Student("Kiran", "B")
	        );

	        // Group students by grade and collect names
	        Map<String, List<String>> groupedResult = students.stream()
	                        .collect(Collectors.groupingBy(
	                                Student::getGrade,
	                                Collectors.mapping(Student::getName, Collectors.toList())));

	        System.out.println(groupedResult);

	}

}


class Student {  // Student class
    private String name;
    private String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }
}
