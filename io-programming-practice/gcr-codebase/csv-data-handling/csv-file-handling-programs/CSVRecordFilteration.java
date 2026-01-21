package com.io_programming;

import java.io.BufferedReader;
import java.io.FileReader;

public class CSVRecordFilteration {

	public static void main(String[] args) {
		String file = System.getProperty("user.dir")+"//csv-data//student.csv"; // file path
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){ // try-with-resources block
			String line ;
			boolean skipHeader=true;
			System.out.println("Records above 80 marks -> ");
			System.out.println("ID\tName\tAge\tMarks");
			while((line=br.readLine())!=null) {
				if(skipHeader) {  // skip header row
					skipHeader=false;
					continue;
				}
				 String []data = line.split(",");
				 int marks = Integer.parseInt(data[3]);
				 if(marks>80) {  // filter record
					 
					 for(String value : data) {
						 System.out.print(value+"\t");  // print records
					 }
					 System.out.println();
				 }
			}
		}catch(Exception e) {  // catch block
			e.printStackTrace();
		}
		

	}

}
