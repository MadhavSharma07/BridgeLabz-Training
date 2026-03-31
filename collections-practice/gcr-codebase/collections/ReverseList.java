import java.util.*;

public class ReverseList {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();    // array list
        List<Integer> linkedList = new LinkedList<>();  // linked list
        int arr[] = { 2, 4, 1, 3, 6, 5, 9, 0 };
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);   // add elements in array list
            linkedList.add(arr[i]);  // add elements in linked list
        }

        System.out.println("Before reverse " + arrayList);
        arrayListReverse(arrayList);
        System.out.println("Reversed arrayList is :" + arrayList);  // print reversed array list
        linkedListReverse(linkedList);
        System.out.println("Reversed linkedList is :" + linkedList); // print reversed linked list

    }

    public static void arrayListReverse(List<Integer> arrayList) {  // method to reverse array list
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arrayList.size(); i++) {  // reverse array list using stack
            stack.push(arrayList.remove(i));
        }
        while (!stack.isEmpty()) {
            arrayList.add(stack.pop());
        }

    }

    public static void linkedListReverse(List<Integer> linkedList) {  /// method to reverse linked list
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < linkedList.size(); i++) {  // reverse linked list using stack
            stack.push(linkedList.remove(i));
        }
        while (!stack.isEmpty()) {
            linkedList.add(stack.pop());
        }

    }

}
