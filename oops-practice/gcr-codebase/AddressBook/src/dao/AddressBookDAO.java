package dao;

import model.Contact;
import java.util.ArrayList;
import java.util.List;

public class AddressBookDAO {

    private List<Contact> contactList = new ArrayList<>();

    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    public List<Contact> getAllContacts() {
        return contactList;
    }

    public void deleteContact(String name) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getFirstName().equalsIgnoreCase(name)) {
                contactList.remove(i);
                break;
            }
        }
    }
}

