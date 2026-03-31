package oops-practice.gcr-codebase.java-inheritance;

class Boook{           // parent class Book
	String title;
	int publicationYear ;
	Boook(String title,int publicationYear){
		this.title = title;
		this.publicationYear = publicationYear;
	}
	
}

class Author extends Boook{        // child class Author
	String authorName ;
	String bio ;
	Author(String title,int publicationYear,String authorName, String bio){
		super(title,publicationYear);
		this.authorName = authorName;
		this.bio = bio;
	}
	void printDetails() {
		System.out.println(title + " is written by "+ authorName + "(" + bio + ")" +" in year "+ publicationYear );
	}
}

public class LibraryManagement {       // Main class

	public static void main(String[] args) {
		Author author = new Author("Wings of fire",1990,"APJ Abdul kalam","Missile man of India"); // create object author of subclass Author
		author.printDetails(); // display dettails
	}

}
