package com.io_programming;

import java.io.BufferedReader;
import java.io.FileReader;


public class ReadCSVFile {

	public static void main(String[] args) throws Exception  {
		
		String file = System.getProperty("user.dir")+"\\csv-data\\student.csv"; // file path
		
		FileReader reader = new FileReader(file); // file reader  object
		BufferedReader br = new BufferedReader(reader);// buffer reader object
		
		try {// try block
			String line;
			while((line=br.readLine())!=null) {
				String data[] = line.split(",");
				for(String value :data) {
					System.out.print(value+"\t");
				}
				System.out.println();
				
			}
		}catch(Exception e) {  // catch block
			e.printStackTrace();
		}
		
		finally {  // finally block
			reader.close();
			br.close();
			
		}
	}

}
