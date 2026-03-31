import java.util.*;

public class NthElementFromLast {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");  // add elements
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");

        int n = 2;  // position from end 

        String nthElement = findNthFromEnd(linkedList, n);
        System.out.println("Nth element from end: " + nthElement);  // print nth element from end
    }

    public static String findNthFromEnd(LinkedList<String> linkedList, int n) {  //  method to find nth elment from end
        int slow = 0;
        int fast = 0;

        for (int i = 0; i < n; i++) {   // 
            if (fast >= linkedList.size()) {
                return null; // n is larger than linkedList length
            }
            fast++;
        }

        while (fast < linkedList.size()) {
            slow++;
            fast++;
        }

        return linkedList.get(slow); 
    }
}


