import java.io.*;

public class UpperCaseToLowerCase {
    
    public static void main(String[] args) {

        BufferedReader br = null; // buffer reader object
        BufferedWriter bw = null; // buffer writer object

        try { // try block
            br = new BufferedReader(new FileReader("input.txt"));
            bw = new BufferedWriter(new FileWriter("output.txt"));

            int ch;
            while ((ch = br.read()) != -1) {

                char character = (char) ch;

                if (character >= 'A' && character <= 'Z') {
                    character = (char) (character + 32); // convert to lowercase
                }

                bw.write(character);
            }

            System.out.println();

        } catch (IOException e) {  // catch block
            System.out.println("Error while processing files.");

        } finally {  // finally block
            try {
                if (br != null)
                    br.close();
                if (bw != null)
                    bw.close();
            } catch (IOException e) {
                System.out.println("Error while closing files.");
            }
        }
    }
}

