package service;

import dao.AddressBookDAO;
import model.Contact;

import java.util.*;
import java.io.*;

import com.opencsv.CSVWriter;
import com.opencsv.CSVReader;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class AddressBookService {

    private AddressBookDAO dao = new AddressBookDAO();

    // UC-1, UC-6
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

    // UC-9
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

    // UC-13 TEXT FILE
    public void writeToFile(String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (Contact c : dao.getAllContacts()) {
                writer.write(c.getFirstName() + "," +
                             c.getLastName() + "," +
                             c.getCity() + "," +
                             c.getState() + "," +
                             c.getZip() + "," +
                             c.getPhone());
                writer.newLine();
            }
            writer.close();
            System.out.println("Data written to text file");
        } catch (Exception e) {
            System.out.println("Error writing file");
        }
    }

    public void readFromFile(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                Contact c = new Contact(
                        data[0], data[1],
                        data[2], data[3],
                        data[4], data[5]);
                dao.addContact(c);
            }
            reader.close();
            System.out.println("Data loaded from text file");
        } catch (Exception e) {
            System.out.println("Error reading file");
        }
    }

    // UC-14 CSV
    public void writeCSV(String fileName) {
        try {
            CSVWriter writer = new CSVWriter(new FileWriter(fileName));
            for (Contact c : dao.getAllContacts()) {
                String[] data = {
                        c.getFirstName(),
                        c.getLastName(),
                        c.getCity(),
                        c.getState(),
                        c.getZip(),
                        c.getPhone()
                };
                writer.writeNext(data);
            }
            writer.close();
            System.out.println("CSV file created");
        } catch (Exception e) {
            System.out.println("Error writing CSV");
        }
    }

    public void readCSV(String fileName) {
        try {
            CSVReader reader = new CSVReader(new FileReader(fileName));
            String[] data;
            while ((data = reader.readNext()) != null) {
                Contact c = new Contact(
                        data[0], data[1],
                        data[2], data[3],
                        data[4], data[5]);
                dao.addContact(c);
            }
            reader.close();
            System.out.println("CSV loaded");
        } catch (Exception e) {
            System.out.println("Error reading CSV");
        }
    }

    // UC-15 JSON
    public void writeJSON(String fileName) {
        try {
            Gson gson = new Gson();
            FileWriter writer = new FileWriter(fileName);
            gson.toJson(dao.getAllContacts(), writer);
            writer.close();
            System.out.println("JSON file created");
        } catch (Exception e) {
            System.out.println("Error writing JSON");
        }
    }

    public void readJSON(String fileName) {
        try {
            Gson gson = new Gson();
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            Type type = new TypeToken<List<Contact>>() {}.getType();
            List<Contact> list = gson.fromJson(reader, type);
            for (Contact c : list) {
                dao.addContact(c);
            }
            reader.close();
            System.out.println("JSON loaded");
        } catch (Exception e) {
            System.out.println("Error reading JSON");
        }
    }
}

