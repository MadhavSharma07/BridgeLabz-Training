package model;


public class Contact {

    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private String zip;
    private String phone;

    public Contact(String firstName, String lastName,
                   String city, String state,
                   String zip, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getZip() { return zip; }
    public String getPhone() { return phone; }

    @Override
    public boolean equals(Object obj) {
        Contact c = (Contact) obj;
        return this.firstName.equalsIgnoreCase(c.firstName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName +
                " | " + city +
                " | " + state +
                " | " + zip +
                " | " + phone;
    }
}

