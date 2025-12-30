package gcr-codebase.stack-queue-and-hashingfunction;


import java.util.*;
public class SortStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();  // initialise stack
        System.out.println("Enter the number of elements in the stack:");
        int n = sc.nextInt();    // number of elements
        System.out.println("Enter the elements of the stack:");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());      // push elements in stack
        }
        System.out.println("Original Stack: " + stack);
        stackSort(stack);
        System.out.println("Sorted Stack: " + stack);

    }

    static void stackSort(Stack<Integer> stack) {  // method to sort stack
        if (!stack.isEmpty()) {
            int temp = stack.pop();    // remove top element
            stackSort(stack);      // recursive call
            sortedOrderInsertion(stack, temp);
        }
    }

    
    static void sortedOrderInsertion(Stack<Integer> stack, int element) {  // method to insert elements in sorted order in stack
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
        } else {
            int temp = stack.pop();
            sortedOrderInsertion(stack, element); 
            stack.push(temp); 
        }
    }
}
