import java.util.*;

public class QueueReverse {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); 
        queue.add(10);// add elements in queue
        queue.add(20);
        queue.add(30);

        reverse(queue); 

        System.out.println(queue);  // print reversed queue
    }

    static void reverse(Queue<Integer> queue) {  // method to reverse queue
        if (queue.isEmpty()) {
            return;
        }

        int front = queue.remove();  // remove front element
        reverse(queue);              // reverse remaining queue
        queue.add(front);            // add element at end
    }
}


