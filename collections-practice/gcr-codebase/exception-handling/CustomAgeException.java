import java.util.*;

public class CustomAgeException {
    
    static void validateAge(int age) throws InvalidAgeException {  //method to validate age
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");    // throw invalid age exception
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {  // try block
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            validateAge(age);
            System.out.println("Access granted!");

        } catch (InvalidAgeException e) {  // catch invalid age exception 
            System.out.println(e.getMessage());

        } finally {  // finally block
            sc.close();
        }
    }
}

class InvalidAgeException extends Exception { //custom exception class
    InvalidAgeException(String message) {
        super(message);
    }
}

