import java.util.*;

interface calculateBill {  // interface calculate bill
    int calculateBill();

}

abstract class Plane {  // abstract class Plane
    private int planeId;
    private String planeName;

    Plane(int planeId, String planeName) {  // constructor
        this.planeId = planeId;
        this.planeName = planeName;
    }

    public int getPlaneId() { // getter methods
        return planeId;
    }

    public String getPlaneName() {
        return planeName;
    }

    void displayInfo() { // method to display info
        System.out.println("Plane id -:" + planeId);
        System.out.println("Plane Name -: " + planeName);
    }

}

class Flight extends Plane {  // class flight  extends abstract class plane 
    private String source;
    private String destination;
    private int distance;

    Flight(int planeId, String planeName, String source, String destination, int distance) { // constructor
        super(planeId, planeName);
        this.source = source;
        this.destination = destination;
        this.distance = distance;
    }

    public String getSource() { // getter methods
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getDistance() {
        return distance;
    }
}

class Booking extends Flight implements calculateBill {  // class booking extends flight class and implements calculate bill interface
    private int userId;
    private String userName;
    private int amount;

    Booking(int planeId, String planeName, String source, String destination, int distance, int userId, String userName,
            int amount) {
        super(planeId, planeName, source, destination, distance);
        this.userId = userId;
        this.userName = userName;
        this.amount = amount;
    }

    public int getUserId() {// getter methods
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setAmount(int amount) {  // setter methods
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public int calculateBill() {  // method to calculate flight bill
        int dist = super.getDistance();
        return dist * getAmount();
    }

    @Override
    void displayInfo() {  // method to disply info of booking
        super.displayInfo();
        System.out.println("User Id :-"+this.getUserId());
        System.out.println("User Name :-"+this.getUserName());
        System.out.println("Filght Source :-"+super.getSource());
        System.out.println("Flight Destination :-"+super.getDestination());
        System.out.println("Distance :-"+super.getDistance());
        System.out.println("Total Bill -: " + calculateBill());
    }

}

public class FlightBookingSystem {  // main class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isFind = false;

        Flight[] flights = {
                new Flight(101, "Air India", "Delhi", "Mumbai", 180),
                new Flight(102, "IndiGo", "Delhi", "Bangalore", 200),
                new Flight(103, "SpiceJet", "Mumbai", "Goa", 400)
            };
        List<Booking> bookings = new ArrayList<>();
        while (true) {
            System.out.println("\tFlight Booking System\t");
            System.out.print(
                    "Enter the choice: \n1. Display Flights\n 2. Searching Flight \n 3. Booking Flight \n 4. Exit");
            System.out.println();
            int choice = sc.nextInt();
            

            switch (choice) {

                case 1:
                    for (Flight flight : flights) {
                        System.out.println(
                                "ID :- " + flight.getPlaneId() +
                                        "\nName :- " + flight.getPlaneName() +
                                        "\nSource :- " + flight.getSource() +
                                        "\nDestination :- " + flight.getDestination());
                    }
                    break;

                case 2:
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter destination to search: ");
                    String destination = sc.nextLine();

                    isFind = false;
                    for (Flight flight : flights) {
                        if (flight.getDestination().equalsIgnoreCase(destination)) {
                            System.out.println("Flight Found!");
                            System.out.println(
                                    "Plane ID :- " + flight.getPlaneId() +
                                            "\nPlane Name :- " + flight.getPlaneName() +
                                            "\nSource :- " + flight.getSource() +
                                            "\nDestination :- " + flight.getDestination());
                            isFind = true;
                        }
                    }

                    if (!isFind) {
                        System.out.println("Flight is not available.");
                    }
                    break;

                case 3:
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter destination for booking: ");
                    String dest = sc.nextLine();

                    isFind = false;
                    for (Flight flight : flights) {
                        if (flight.getDestination().equalsIgnoreCase(dest)) {
                            isFind = true;
                            
                            System.out.print("Enter User Name: ");
                            String name = sc.nextLine();

                            System.out.print("Enter User ID: ");
                            int id = sc.nextInt();

                            Booking booking = new Booking(
                                    flight.getPlaneId(),
                                    flight.getPlaneName(),
                                    flight.getSource(),
                                    flight.getDestination(),
                                    flight.getDistance(),
                                    id,
                                    name,
                                    12);

                            bookings.add(booking);  // add in bookings array list
                            booking.displayInfo();
                            break;
                        }
                    }

                    if (!isFind) {
                        System.out.println("Flight is not available.");
                    }
                    break;

                case 4:
                    System.out.println("Thank You");
                    sc.close();
                    return; // exit program

                default:
                    System.out.println("Invalid Choice");
            }

        }

    }
}
