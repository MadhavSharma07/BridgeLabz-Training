package com.io_programming;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class SearchCSVData {

	public static void main(String[] args) {
		File file =new File(System.getProperty("user.dir"),"/csv-data/employee.csv") ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String findName = sc.next();
		boolean found =false;
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			while((line=br.readLine())!=null) {
				String data[] = line.split(",");
				String name = data[1];
				if(name.equalsIgnoreCase(findName)) {
					found=true;
					System.out.println("Data Found !!!");
					System.out.println("Department -> "+data[2]);
					System.out.println("Salary -> "+data[3]);
					
					
				}
				
			}if(found==false) {
				System.out.println("Data not found !!!");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
