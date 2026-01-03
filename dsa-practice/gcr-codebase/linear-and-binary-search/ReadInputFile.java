import java.io.*;

public class ReadInputFile{
    public static void main(String[] args) {
        String path="file.txt";  // path of file 

        try{
            FileReader fileReader = new FileReader(path);  // file reader object
            BufferedReader bufferReader = new BufferedReader(fileReader);  // buffer reader object
            String line;
            while((line=bufferReader.readLine())!=null){
                System.out.println(line);  // print line 
            }
            bufferReader.close();
            fileReader.close();
        }
        catch(IOException e){
            System.out.println("Error");  // print error
        }
       
    }
}