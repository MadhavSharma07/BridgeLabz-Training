package presentation;

import model.Contact;
import service.AddressBookService;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AddressBookService service = new AddressBookService();

        while (true) {
            System.out.println("1. Add Contact");
            System.out.println("2. Delete Contact");
            System.out.println("3. View All Contacts");
            System.out.println("4. Search By City");
            System.out.println("5. Count By City");
            System.out.println("6. Sort By Name");
            System.out.println("7. Sort By City");
            System.out.println("8. Sort By State");
            System.out.println("9. Sort By Zip");
            System.out.println("10. Write To Text File");
            System.out.println("11. Read From Text File");
            System.out.println("12. Write To CSV File");
            System.out.println("13. Read From CSV File");
            System.out.println("14. Write To JSON File");
            System.out.println("15. Read From JSON File");
            System.out.println("16. Exit");
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
                    System.out.print("Enter name to delete: ");
                    service.deleteContact(sc.next());
                    break;

                case 3:
                    for (Contact c : service.getContacts()) {
                        System.out.println(c);
                    }
                    break;

                case 4:
                    System.out.print("Enter city to search: ");
                    service.searchByCity(sc.next());
                    break;

                case 5:
                    service.countByCity();
                    break;

                case 6:
                    service.sortByName();
                    System.out.println("Sorted by Name");
                    break;

                case 7:
                    service.sortByCity();
                    System.out.println("Sorted by City");
                    break;

                case 8:
                    service.sortByState();
                    System.out.println("Sorted by State");
                    break;

                case 9:
                    service.sortByZip();
                    System.out.println("Sorted by Zip");
                    break;

                case 10:
                    service.writeToFile("contacts.txt");
                    break;

                case 11:
                    service.readFromFile("contacts.txt");
                    break;

                case 12:
                    service.writeCSV("contacts.csv");
                    break;

                case 13:
                    service.readCSV("contacts.csv");
                    break;

                case 14:
                    service.writeJSON("contacts.json");
                    break;

                case 15:
                    service.readJSON("contacts.json");
                    break;

                case 16:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
