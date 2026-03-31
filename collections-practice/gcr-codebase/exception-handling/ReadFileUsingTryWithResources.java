import java.io.*;

public class ReadFileUsingTryWithResources {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {   // try-with-resources block 
            String line = br.readLine();
            if (line != null) {
                System.out.println(line);
            }

        } catch (IOException e) {  // catch block
            System.out.println("Error reading file");
        }
    }
}

