package oops.gcr-codebase.class-and-object;

class Student {
    // non static variables
    String name;        
	String rollNumber;
	double[] marks;

    Student(String name,String rollNumber,double[] marks){      // constructor
        this.name= name;
        this.rollNumber= rollNumber;
        this.marks = marks;
    }

    public double totalMarks(double[] marks)     // method to calculate total marks
	{
		double sum = 0;
		for(int i=0;i < marks.length ; i++ ) {
			sum+=marks[i];
		}
		return sum/3;
	}

    public String grade(double[] marks ) {           // method to calculate grade
		
		double totalMarks = totalMarks(marks);         // store total marks
		
		
		if(totalMarks >= 80 && totalMarks<=100) {              //to check the grade of student
			return "Grade A";
		}
		else if((totalMarks >=60)&&(totalMarks <80)){
			return "Grade B";
		}
		else if((totalMarks >=50)&&(totalMarks <60)) {
			return "Grade C";
		}
		else if((totalMarks >=40)&&(totalMarks <50)) {
			return "Grade D";
	    }
		else {
			return "Grade F";
		}
		
	}

    public void display() {
		System.out.println("Student Name: "+name);
		
		System.out.println("Student RollNumber: "+rollNumber);
		
		System.out.println("Student Marks:");
		
		for(int i=0;i < marks.length ; i++ ) {
			System.out.println("Mark"+(i+1)+": "+marks[i]);
		}
		
		System.out.println(grade(marks));
	}

    public static void main(String[] args) {
		
		double[] mark1 = {80,70,75};      //variables to store the marks
		double[] mark2 = {60,65,50};
		
		
		Student student1 = new Student("Thamarai", "ECE001", mark1);  // create ojbect and calling constructor
		Student student2 = new Student("Kannan","CSC002",mark2);
		
		
		student1.display();  //calling the display method
		student2.display();
	}
}





