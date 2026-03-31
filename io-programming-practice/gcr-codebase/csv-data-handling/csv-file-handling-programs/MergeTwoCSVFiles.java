package com.io_programming;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MergeTwoCSVFiles {

    public static void main(String[] args) {

        File file1 = new File(System.getProperty("user.dir"), "csv-data/student1.csv");
        File file2 = new File(System.getProperty("user.dir"), "csv-data/student2.csv");
        File outputFile = new File(System.getProperty("user.dir") ,"csv-data/student-merged.csv");

        Map<String, String[]> studentMap = new HashMap<>();

        try (
            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            BufferedReader br2 = new BufferedReader(new FileReader(file2));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {

            String line;

            
            boolean skipHeader = true;
            while ((line = br1.readLine()) != null) { // read first CSV file

                if (skipHeader) {
                    skipHeader = false;
                    continue;
                }

                String[] data = line.split(",");
                studentMap.put(data[0], data); 
            }

       
            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();

     
            skipHeader = true;
            while ((line = br2.readLine()) != null) { // read second CSV file

                if (skipHeader) {
                    skipHeader = false;
                    continue;
                }

                String[] data2 = line.split(",");
                String id = data2[0];

                if (studentMap.containsKey(id)) {
                    String[] data1 = studentMap.get(id);

                    bw.write( id + "," +data1[1] + "," +data1[2] + "," +data2[1] + "," + data2[2]);
                    bw.newLine();
                }
            }

            System.out.println("CSV files merged successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

