public class Book {

    
    static String libraryName = "Central Library";          // Static variable shared by all books

   
    private String titleOfBook;     // Instance variables titleOfBook 
    private String authorOfBook;

    
    private final String isbn;       // Final variable (cannot be changed)

    // Constructor using this keyword
    public Book(String titleOfBook, String authorOfBook, String isbn) {
        this.titleOfBook = titleOfBook;
        this.authorOfBook = authorOfBook;
        this.isbn = isbn;
    }

    
    public static void printLibraryName() {          // Static method to display library name
        System.out.println("Library Name: " + libraryName);
    }

   
    public void printDetails() {       // Method to display book details
        System.out.println("Title : " + titleOfBook);
        System.out.println("Author: " + authorOfBook);
        System.out.println("ISBN  : " + isbn);
    }

    
    public static void main(String[] args) {

        Book book1 = new Book("Java", "Shivam", "ISBN007");
        Book book2 = new Book("Python", "Sarthak", "ISBN008");

        
        Book.printLibraryName();        // Display library name using static method

        
        if (book1 instanceof Book) {        // instanceof check before displaying details
            System.out.println("\nBook 1 Details:");
            book1.printDetails();
        }

        if (book2 instanceof Book) {
            System.out.println("\nBook 2 Details:");
            book2.printDetails();
        }
    }
}
