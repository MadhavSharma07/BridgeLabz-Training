package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StaticFieldModificationUsingReflection {

    public static void main(String[] args) throws Exception {

        Class<?> confi = Configuration.class;

        // Access private static field
        Field field = confi.getDeclaredField("API_KEY");
        field.setAccessible(true);

        // Access private static method
        Method displayMethod = confi.getDeclaredMethod("display");
        displayMethod.setAccessible(true);

        // Display OLD value
        System.out.print("Old ");
        displayMethod.invoke(null);

        // Modify static field
        field.set(null, "Fetch Code 453");

        // Display NEW value
        System.out.print("New ");
        displayMethod.invoke(null);
    }
}

class Configuration {

    private static String API_KEY = "Fetch Code 123";

    private static void display() {
        System.out.println("API_KEY -> " + API_KEY);
    }
}
