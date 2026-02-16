package service;

import dao.AddressBookDAO;
import model.Contact;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressBookService {

    private AddressBookDAO dao = new AddressBookDAO();

    // UC-1, UC-6, UC-7
    public void addContact(Contact contact) {
        for (Contact c : dao.getAllContacts()) {
            if (c.equals(contact)) {
                System.out.println("Duplicate contact not allowed");
                return;
            }
        }
        dao.addContact(contact);
    }

    // UC-3
    public void deleteContact(String name) {
        dao.deleteContact(name);
    }

    // UC-4, UC-5
    public List<Contact> getContacts() {
        return dao.getAllContacts();
    }

    // UC-8
    public void searchByCity(String city) {
        for (Contact c : dao.getAllContacts()) {
            if (c.getCity().equalsIgnoreCase(city)) {
                System.out.println(c);
            }
        }
    }

    // UC-9 & UC-10
    public void countByCity() {
        Map<String, Integer> map = new HashMap<>();

        for (Contact c : dao.getAllContacts()) {
            if (map.containsKey(c.getCity())) {
                map.put(c.getCity(), map.get(c.getCity()) + 1);
            } else {
                map.put(c.getCity(), 1);
            }
        }

        for (String city : map.keySet()) {
            System.out.println(city + " : " + map.get(city));
        }
    }

    // UC-11
    public void sortByName() {
        Collections.sort(dao.getAllContacts(),
                (c1, c2) -> c1.getFirstName()
                              .compareToIgnoreCase(c2.getFirstName()));
    }

    // UC-12
    public void sortByCity() {
        Collections.sort(dao.getAllContacts(),
                (c1, c2) -> c1.getCity()
                              .compareToIgnoreCase(c2.getCity()));
    }

    public void sortByState() {
        Collections.sort(dao.getAllContacts(),
                (c1, c2) -> c1.getState()
                              .compareToIgnoreCase(c2.getState()));
    }

    public void sortByZip() {
        Collections.sort(dao.getAllContacts(),
                (c1, c2) -> c1.getZip()
                              .compareTo(c2.getZip()));
    }
}
