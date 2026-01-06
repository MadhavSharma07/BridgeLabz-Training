import java.util.*;

public class BinaryNumbersUsingQueue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();    // take number from user
        generateBinary(n);  // generate binary
    }

    static void generateBinary(int n) {  // method to generate binary
        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        for (int i = 0; i < n; i++) {
            String current = queue.remove();
            System.out.print(current + " ");

            queue.add(current + "0");
            queue.add(current + "1");
        }
    }
}



