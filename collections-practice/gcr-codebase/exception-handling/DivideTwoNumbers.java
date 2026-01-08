
import java.util.*;

public class DivideTwoNumbers {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {   // try block
            System.out.print("Enter first number: ");
            int number1 = sc.nextInt();  // take first number from user

            System.out.print("Enter second number: ");
            int number2 = sc.nextInt();  // take second number from user

            int result = number1 / number2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {  // catch arithmetic exception
            System.out.println("Error: Cannot divide by zero.");

        } catch (InputMismatchException e) {  // catch input mismatched exception
            System.out.println("Error: Please enter only numeric values.");

        } finally {  // finally block
            sc.close();
        }
    }
}

