

import java.util.*;
class Task{ // Task Node Class
    int id;
    String name;
    String priority;
    String dueDate;
    Task next;
    public Task(int id, String name, String priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
public class TaskScheduler {// main class 
    private Task head;
    private Task tail;
    private Task current;

    public TaskScheduler() {
        this.head = null;
        this.tail = null;
        this.current = null;
    }

    public void addTask(int id, String name, String priority, String dueDate) { // method to add task
        Task newTask = new Task(id, name, priority, dueDate);
        if (head == null) {
            head = newTask;
            tail = newTask;
            newTask.next = head;
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head;
        }
    }

    public void removeTask(int id) {     // method to remove task 
        if (head == null) return;

        Task current = head;
        Task previous = tail;

        do {
            if (current.id == id) {
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    tail = previous;
                    tail.next = head;
                } else {
                    previous.next = current.next;
                }
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);
    }
    public void displayTasks() {      // method to display task
        if (head == null) return;

        Task current = head;
        do {
            System.out.println("ID: " + current.id + ", Name: " + current.name + ", Priority: " + current.priority + ", Due Date: " + current.dueDate);
            current = current.next;
        } while (current != head);
    }
    public static void main(String[] args) {   // main method
        Scanner sc= new Scanner(System.in);
        TaskScheduler taskScheduler = new TaskScheduler();
        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Display Tasks");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Task ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Task Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Task Priority: ");
                    String priority = sc.nextLine();
                    System.out.print("Enter Task Due Date: ");
                    String dueDate = sc.nextLine();
                    taskScheduler.addTask(id, name, priority, dueDate);
                    break;
                case 2:
                    System.out.print("Enter Task ID to remove: ");
                    int removeId = sc.nextInt();
                    taskScheduler.removeTask(removeId);
                    break;
                case 3:
                    taskScheduler.displayTasks();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}