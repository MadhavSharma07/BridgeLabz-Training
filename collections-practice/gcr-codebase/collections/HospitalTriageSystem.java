import java.util.*;

public class HospitalTriageSystem {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>((p1, p2) -> p2.severity - p1.severity);
        pq.add(new Patient("John", 3));// Adding patients in priorityqueue
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));
        System.out.println("Treatment Order:");

        // Treat patients based on priority
        while (!pq.isEmpty()) {
            Patient p = pq.remove();
            System.out.println(p.name);  // print patient name having higher priority 
        }
    }
}

class Patient {  // patient class
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

