package gcr-codebase.linkedlist;


import java.util.*;
class Book{      // Book Nocde class
    String title;
    String author;
    int id;
    Book prev;
     boolean isAvailable;
    Book next;
    Book(String title,  String author, int id) {
         this.title =  title;
        this.author =  author;
        this.id  = id;
         this.isAvailable = true; 
        this.prev = null;
         this.next = null;
    }
}
public class LibraryMangementSystem { // main class
    private Book head;  // head node
    private Book tail; // tail node
        public LibraryMangementSystem() {
        this.head = null;
        this.tail = null;
    }
      public void  addBook(String title, String author, int id) {    // method to add book
        Book newBook = new Book(title, author, id);
        if (head == null) {
             head = newBook;
            tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    public  void removeBook(int id) {  // method to remove book
        Book current = head;
        while  (current != null) {
            if (current.id == id) {
               if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                return;
            }
            current = current.next;
        }
    }
    
    public void displayBooks() {  // method to display book
        Book current = head;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Author: " + current.author + 
                               ", ID: " + current.id + ", Available: " + current.isAvailable);
            current = current.next;
        }
    }
    public void calculateAvailability() {  // method to check availability
        Book current = head;
        while (current != null) {
            if (current.isAvailable) {
                System.out.println("Book ID " + current.id + " is available.");
            } else {
                System.out.println("Book ID " + current.id + " is not available.");
            }
            current = current.next;
        }
    }
    public static void main(String[] args) { // main method
          Scanner sc =new Scanner(System.in);
        LibraryMangementSystem library = new LibraryMangementSystem();
        while (true) {
             System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Check Availability");
            
            System.out.println("5. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    library.addBook(title, author, id);
                    break;
                case 2:
                    System.out.print("Enter ID of Book to remove: ");
                    int removeId = sc.nextInt();
                    library.removeBook(removeId);
                    break;
                case 3:
                    library.displayBooks();
                    break;
                case 4:
                    library.calculateAvailability();
                    break;
                case 5:
                    
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
