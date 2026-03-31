import java.util.*;

class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:"); // input string
        String input = sc.nextLine();
        String revString = new String();
        for (int i = input.length() - 1; i >= 0; i--) {  //reverse loop add character to new string
            revString += input.charAt(i);
        }
        System.out.println("Reverse String is:" + revString); // print reverse string
    }
}