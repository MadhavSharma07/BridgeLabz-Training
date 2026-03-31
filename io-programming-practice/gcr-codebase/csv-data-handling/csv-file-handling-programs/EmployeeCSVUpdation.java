package com.io_programming;
import java.io.*;

public class EmployeeCSVUpdation {

	public static void main(String[] args) {
		File inputFile = new File(System.getProperty("user.dir")+"/csv-data/employee.csv");
		File outputFile = new File(System.getProperty("user.dir")+"/csv-data/employee -updated");
		
		try(BufferedReader br = new BufferedReader(new FileReader(inputFile));
				BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))){
			
			String line;
			boolean header=true;
			
			while((line=br.readLine())!=null) {
				
				if(header) {
					bw.write(line);
					bw.newLine();
					header = false;
					continue;
				}
				String data[] = line.split(",");
				String department = data[2];
				Double salary = Double.parseDouble(data[3]);
				if(department.equalsIgnoreCase("IT")) {
					salary= salary+(salary*0.10);
					}
				bw.write(data[0]+","+data[1]+","+department+","+salary);
				bw.newLine();
			}
			System.out.println("Employee CSV data updated !!!");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		

	}

}
