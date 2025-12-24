package oops.gcr-codebase.java-constructor;

class Book {
    public String ISBN;  // Public variable
    protected String title;   // Protected variable
    private String author;  // Private variable

    public Book(String ISBN, String title, String author) {         // Constructor
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    
    public void setAuthor(String author) {  // setter method to modify author
        this.author = author;
    }

    
    public String getAuthor() {          // Getter method to access author
        return author;
    }

    
    public void printBookDetails() {           // Method to display book details
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass demonstrating access modifiers
class EBook extends Book {

    private double fileSize;

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void printEBookDetails() {
        System.out.println("ISBN: " + ISBN);          // public member
        System.out.println("Title: " + title);        // protected member
        System.out.println("Author: " + getAuthor()); // private via getter
        System.out.println("File Size: " + fileSize + " MB");
    }
}

// Main class
public class BookLibrarySystem {

    public static void main(String[] args) {

        EBook ebook = new EBook("123456789","Java","Aditya",1.0);

        ebook.printEBookDetails();

        
        ebook.setAuthor("J. Bloch");  // Modify author using setter

        System.out.println("\nAfter updating author:");
        ebook.printEBookDetails();
    }
}

