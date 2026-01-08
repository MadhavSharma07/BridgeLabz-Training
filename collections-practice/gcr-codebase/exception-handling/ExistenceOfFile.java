import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ExistenceOfFile {

    public static void main(String[] args) {

        BufferedReader br = null;

        try {  // try block
            br = new BufferedReader(new FileReader("data.txt"));  // initialise buffer reader object

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("File not found");

        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
