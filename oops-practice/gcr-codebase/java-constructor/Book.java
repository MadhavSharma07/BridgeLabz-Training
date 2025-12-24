package oops.gcr-codebase.java-constructor;

class Book {
    String title;         // non static variables
	String author;
	double price;

    Book(String title,String author,double price){        //   Parameterize constructor
        this.title = title;
        this.author = author;
        this.price = price;
    }
    Book() {                  // default constructor
		title="Atomic Habits ";
		author = "H";
		price= 120;
	}
	

    public void displayDetails() {          // method to print details
		System.out.println("Title of the book: "+title);
		System.out.println("Author of the book: "+author);
		System.out.println("Price of the book: "+price);
	}

    public static void main(String[] args) {
		System.out.println("Defult Constructor");
		Book bookDefaultConstructor = new Book();
	    bookDefaultConstructor.displayDetails();
		System.out.println();
		System.out.println("Parameterize Constructor");
		Book bookParameterizeConstructor = new Book("anuj", "mathura" , 3);
		bookParameterizeConstructor.displayDetails();

		

	}
}
