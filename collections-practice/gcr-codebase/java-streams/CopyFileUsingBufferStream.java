import java.io.*;

public class CopyFileUsingBufferStream {

    public static void main(String[] args) {

        File input = new File("input.txt");  // input text file
        File output = new File("output.txt");  // output text file
        BufferedInputStream bis = null;  // Buffer input stream object
        BufferedOutputStream bos = null; // Buffer output stream object

        try {  // try block
            if (!input.exists()) {
                System.out.println("Source file does not exist.");
                return;
            }
            bis = new BufferedInputStream(new FileInputStream(input));    
            bos = new BufferedOutputStream(new FileOutputStream(output));
            int data;
            while ((data = bis.read()) != -1) {
                bos.write(data);  // copying data
            }

            System.out.println("File copied successfully using buffered streams.");

        } catch (IOException e) {  // catch block
            System.out.println("Error while reading or writing file.");

        } finally {  // finally block
            try {
                if (bis != null)
                    bis.close();
                if (bos != null)
                    bos.close();
            } catch (IOException e) {
                System.out.println("Error while closing file.");
            }
        }
    }
}

