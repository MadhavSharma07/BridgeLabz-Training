import java.io.*;

public class UserInformation {

    public static void main(String[] args) {

        BufferedReader reader = null;  // buffer reader object
        FileWriter writer = null;  // filw writer object

        try {  // try block
            reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your name: ");
            String name = reader.readLine();  // take name from user
            System.out.print("Enter your age: ");
            String age = reader.readLine();  // take age from user
            System.out.print("Enter your programming language: ");
            String language = reader.readLine();   // take programming language from user

            writer = new FileWriter("userinfo.txt");
            writer.write("Name: " + name + "\n");  // write user information in text file
            writer.write("Age: " + age + "\n");
            writer.write("Language: " + language + "\n");

            System.out.println("User information saved successfully.");

        } catch (IOException e) {  // catch block
            System.out.println("Error while reading input or writing file.");

        } finally {  // finally block
            try {
                if (reader != null)
                    reader.close();
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                System.out.println("Error while closing resources.");
            }
        }
    }
}

