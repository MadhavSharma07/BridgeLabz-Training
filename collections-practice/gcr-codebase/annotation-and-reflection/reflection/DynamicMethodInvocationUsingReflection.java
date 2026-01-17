package reflection;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvocationUsingReflection {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // Create object dynamically
        MathOperations obj = new MathOperations();

        // Get Class object
        Class<?> operation = obj.getClass();

        // Get all declared methods
        Method[] methods = operation.getDeclaredMethods();

        System.out.println("Choose Operation:");
        System.out.println("1. add");
        System.out.println("2. subtract");
        System.out.println("3. multiply");

        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        String methodName = null;

        // Map user choice to method name
        switch (choice) {
            case 1:
                methodName = "add";
                break;
            case 2:
                methodName = "subtract";
                break;
            case 3:
                methodName = "multiply";
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        // Dynamic method invocation
        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                Object result = method.invoke(obj, a, b);
                System.out.println("Result = " + result);
                break;
            }
        }

        sc.close();
    }
}

class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
