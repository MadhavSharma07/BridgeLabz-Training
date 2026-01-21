package com.io_programming;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSVFile {

	public static void main(String[] args)  {
		
		String file = System.getProperty("user.dir")+"\\csv-data\\employee.csv";//file path
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file)) ){ // try-with-resources
			bw.write("ID,Name,Department,Salary\n");
			bw.write("01,Madhav,CSE,10000000000000000\n");
			bw.write("02,Shivam,Electronics,15\n");
			bw.write("03,Sarthak,ECE,120000000\n");
			bw.write("04,Alice Williams,Finance,62000\n");
			bw.write("05,Bob Johnson,Sales,58000\n");
			
			System.out.println("CSV file is Written");
			
		}catch(IOException e) { // catch block
			e.printStackTrace();
		}
	}

}
