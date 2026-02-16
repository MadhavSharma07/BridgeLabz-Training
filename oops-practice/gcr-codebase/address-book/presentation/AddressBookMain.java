package presentation;

import model.Contact;
import service.AddressBookService;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AddressBookService service = new AddressBookService();

        while (true) {
           while (true) {
                System.out.println("\n===== Address Book Menu =====");
                System.out.println("1. Add Contact");
                System.out.println("2. Delete Contact");
                System.out.println("3. View All Contacts");
                System.out.println("4. Search By City");
                System.out.println("5. Count By City");
                System.out.println("6. Sort By Name");
                System.out.println("7. Sort By City");
                System.out.println("8. Sort By State");
                System.out.println("9. Sort By Zip");
                System.out.println("10. Exit");
                System.out.print("Enter your choice: ");

                int choice = sc.nextInt();


            switch (choice) {

                case 1:

                    System.out.println("Enter First Name:");
                    String firstName = sc.next();     
                    System.out.println("Enter Last Name:");
                    String lastName = sc.next();     
                    System.out.println("Enter City:");
                    String city = sc.next();    
                    System.out.println("Enter State:");
                    String state = sc.next();      
                    System.out.println("Enter Zip:");
                    String zip = sc.next();      
                    System.out.println("Enter Phone:");
                    String phone = sc.next();       
                    Contact contact = new Contact(firstName, lastName, city, state, zip, phone); 
                    service.addContact(contact);
                            
                    break;


                case 2:
                    System.out.println("Enter name to delete");
                    service.deleteContact(sc.next());
                    break;

                case 3:
                    for (Contact c : service.getContacts()) {
                        System.out.println(c);
                    }
                    break;

                case 4:
                    System.out.println("Enter city");
                    service.searchByCity(sc.next());
                    break;

                case 5:
                    service.countByCity();
                    break;

                case 6:
                    service.sortByName();
                    break;

                case 7:
                    service.sortByCity();
                    break;

                case 8:
                    service.sortByState();
                    break;

                case 9:
                    service.sortByZip();
                    break;

                case 10:
                    System.exit(0);
            }
        }
    }
}
}
