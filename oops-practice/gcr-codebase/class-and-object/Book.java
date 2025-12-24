package oops.gcr-codebase.class-and-object;

 class Book {

    String title;         // non static variables
	String author;
	double price;

    Book(String title,String author,double price){        // constructor
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {          // method to print details
		System.out.println("Title of the book: "+title);
		System.out.println("Author of the book: "+author);
		System.out.println("Price of the book: "+price);
	}

    public static void main(String[] args) {
	Book book1= new Book("2States", "Chetan Bhagat", 500);        // create object 1 and calling constructor
	Book book2=new Book("Wings Of Fire","Abdul kalam.A.P.J",  500); // create object 2 anf again calling constructor
	book1.displayDetails();
	book2.displayDetails();
	}




}
