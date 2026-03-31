
import java.io.*;
public class CopyFileUsingByteStream {
    
    public static void main(String[] args) {
        File input = new File("input.txt");  // path of input file
        File output = new File("ouput.txt");  // path of output file
        FileInputStream fis = null;  // file input stream object
        FileOutputStream fos = null; // file output stream object
        try {   // try block
            if (!input.exists()) {
                System.out.println("Source file does not exist.");
                return;
            }

            fis = new FileInputStream(input);
            fos = new FileOutputStream(output);

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);     // copying data
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {  // catch block 
            System.out.println("Error while reading or writing file.");

        } finally {  // finally block
            try {
                if (fis != null)
                    fis.close();   
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                System.out.println("Error while closing file.");
            }
        }
    }
}


