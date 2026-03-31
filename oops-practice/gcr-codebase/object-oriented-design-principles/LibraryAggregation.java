package oops-practice.gcr-codebase.object-oriented-design-principleimport java.util.ArrayList;
import java.util.*;

class Book {  // Book class

    private String title;
    private String author;

    
    public Book(String title, String author) { // constructor
        this.title = title;
        this.author = author;
    }

    
    public void printBook() {  // Method to display book details
        System.out.println("Title : " + title + ", Author : " + author);
    }
}


class Library {// Library class 

    private String libraryName;
    private ArrayList<Book> books;

    
    public Library(String libraryName) {  // library class constructor
        this.libraryName = libraryName;
        this.books = new ArrayList<Book>();
    }

    
    public void addBook(Book book) {  //method to  add book to library
        books.add(book);
    }

    
    public void printLibraryDetails() {       // Display library details
        System.out.println("Library Name: " + libraryName);
        System.out.println("Books in library:");
        for (Book b : books) {
            b.printBook();
        }
        System.out.println();
    }
}


public class LibraryAggregation {// main class

    public static void main(String[] args) {

        
        Book book1 = new Book("Java Basics", "James");  // Creating Book objects
        Book book2 = new Book("Data Structures", "Mark");
        Book book3 = new Book("Operating Systems", "Andrew");

        
        Library library1 = new Library("City Library");  // Creating Library objects
        Library library2 = new Library("College Library");

        
        library1.addBook(book1);// adding books to libraries
        library1.addBook(book2);

        library2.addBook(book2); // same book added to another library
        library2.addBook(book3);

        
        library1.printLibraryDetails();  // Display libraries
        library2.printLibraryDetails();
    }
}

