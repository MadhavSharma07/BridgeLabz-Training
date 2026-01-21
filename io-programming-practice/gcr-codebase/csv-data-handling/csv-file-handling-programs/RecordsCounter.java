package com.io_programming;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RecordsCounter {

	public static void main(String[] args)  {
		String file = System.getProperty("user.dir")+"\\csv-data\\student.csv"; // file path
		int count=0;
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			while((line=br.readLine())!=null) {
				count++;
			}
			System.out.println(count-1);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
