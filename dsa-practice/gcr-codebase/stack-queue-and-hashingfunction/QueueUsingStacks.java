import java.util.*;

public class QueueUsingStacks {
	Stack<Integer> stack1= new Stack<>();     // initialise stack1
	Stack<Integer> stack2 =new Stack<>();    // initialise stack2
	
	public void enqueue(int data) {  // enqueue method
		stack1.push(data);
	}
	public int dequeue() {  // dequeue method
		if(isEmpty()) { 
			System.out.print("Queue is empty");
			
		}
		if(stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
	
	public int peek() {    // peek method
		if(isEmpty()) {
			System.out.print("Queue is empty");
			
		}
		if(stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.peek();
	}
	public boolean isEmpty() {  // method to check queue is empty
		return stack1.isEmpty() && stack2.isEmpty();
	}
	public static void main(String[] args) { // main method
		QueueUsingStacks q = new QueueUsingStacks();

	    q.enqueue(10);
	    q.enqueue(20);
	    q.enqueue(30);
	    System.out.println("Dequeued: " + q.dequeue()); 
	    System.out.println("Front: " + q.peek());       
	    q.enqueue(40);
	    System.out.println("Dequeued: " + q.dequeue());
	    System.out.println("Dequeued: " + q.dequeue());
	    System.out.println("Dequeued: " + q.dequeue());
	}

}
