
class Student{      // Student node class
	String name;
	int rollNo;
	int age;
	char grade;
	Student next;
	Student(String name , int rollNo , int age , char grade){//constructor
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
		this.grade = grade;
		this.next = null;
	}
}

public class StudentRecordManagement {       //main class
	
	Student head;     // head node
	Student tail;       // tail node
	static int size;
	StudentRecordManagement(){      //constructor to initialise head and tail null for a empty linkedlist
		this.head = null;
		this.tail = null;
	}
	
	
	public void addAtBeginning(String name,int rollNo, int age, char grade) {  //method to add at beginning
		Student newNode = new Student(name,rollNo,age,grade);
		if(head == null) {
			head = tail = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
		size++;
	}
	
	
	public void addAtEnd(String name,int rollNo, int age, char grade) {  //method to add at end
		Student newNode = new Student(name,rollNo,age,grade);
		if(tail == null) {
			head = tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}
	
	
	public void addAtkPosition(String name,int rollNo, int age, char grade,int k) {   //method to add at specific position  K
		Student newNode = new Student(name,rollNo,age,grade);
		if(k == 1) {
			addAtBeginning(name,rollNo,age,grade);
		}
		else if(k == size) {
			addAtEnd(name,rollNo,age,grade);
		}
		else {
			Student temp = head;
			while(k-- > 2) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
			size++;
		}
		
	}
	
	
	public void deleteByRollNo(int rollNo) {    //method to delete student record by roll number
		Student curr = head;
		Student prev = null;
		while(curr.rollNo != rollNo){
			prev = curr;
			curr = curr.next;
		}
		prev.next = curr.next;
		size--; 
	}
	
	
	public void searchByRollNo(int rollNo) {  //method to search student record by roll number
		Student temp = head;
		int check = 0;
		while(temp!=null) {
			if(temp.rollNo == rollNo) {
				check = 1;
				System.out.println("Record of roll no. :"+ rollNo +":");
				System.out.println("...............................");
				System.out.println("Name :"+temp.name);
				System.out.println("Age :"+temp.age);
				System.out.println("Grade :"+temp.grade);
				System.out.println("................................");
				break;
			}
			else {
				temp = temp.next;
			}
		}
		if(check != 1) {
			System.out.println("Student record with roll no : "+rollNo +" doesn't exist" );
		}
		
	}
	
	
	public void displayAll() {   //method to display all students record
		Student temp = head;
		while(temp!=null) {
			System.out.println("    Student Record     ");
			System.out.println("Name : "+temp.name);
			System.out.println("rollNo : "+temp.rollNo);
			System.out.println("Age : "+temp.age);
			System.out.println("Grade : "+temp.grade);
			System.out.println("..........................");
			temp = temp.next;
		}
	}
	
	
	public void updateGrade(char grade , int rollNo) {  //method to modify student grade based on their rollNo
		Student temp = head;
		while(temp.rollNo != rollNo) {
			temp = temp.next;
		}
		temp.grade = grade;
	}
		
	
	public static void main(String[] args) {
		StudentRecordManagement studentDetails = new StudentRecordManagement();
		studentDetails.addAtBeginning("Madhav", 1, 20, 'A');
		studentDetails.addAtEnd("Shivam", 32, 20, 'B');
		studentDetails.addAtEnd("Aditya", 20, 21, 'B');
		studentDetails.addAtkPosition("Sarthak", 12, 20, 'C', 2);
		System.out.println("Before updation : .....");
		studentDetails.searchByRollNo(12);
		studentDetails.updateGrade('B', 12);
		System.out.println("After updation : .....");
		studentDetails.searchByRollNo(12);
		System.out.println("Before Deletion : .....");
     	studentDetails.displayAll();
		studentDetails.deleteByRollNo(32);
		System.out.println("After deletion of a record : .....");
		studentDetails.displayAll();
	}

}
