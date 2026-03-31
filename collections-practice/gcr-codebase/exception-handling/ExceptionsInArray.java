import java.util.*;

public class ExceptionsInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = null;   // array declared (can cause NullPointerException)

        try {  // try block
            System.out.print("Enter size of array: ");
            int size = sc.nextInt(); // take size of array from user
            array = new int[size];
            System.out.println("Enter array elements:");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }

            System.out.print("Enter index number: ");
            int index = sc.nextInt();  // take index from user

            System.out.println("Value at index " + index + ": " + array[index]);

        } catch (ArrayIndexOutOfBoundsException e) {  // catch array index out of bound exception
            System.out.println("Invalid index!");

        } catch (NullPointerException e) {  // catch null pointer exception
            System.out.println("Array is not initialized!");

        } finally { // finally block
            sc.close();
        }
    }
}

