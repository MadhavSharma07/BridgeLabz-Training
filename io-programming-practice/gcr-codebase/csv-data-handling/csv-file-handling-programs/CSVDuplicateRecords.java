package com.io_programming;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class CSVDuplicateRecords {

    public static void main(String[] args) {

        File file = new File(System.getProperty("user.dir"), "csv-data/student.csv");

        Set<String> uniqueIds = new HashSet<>();
        boolean duplicatesFound = false;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            boolean skipHeader = true;

            System.out.println("Duplicate Records:\n");

            while ((line = br.readLine()) != null) {

                // Skip header
                if (skipHeader) {
                    skipHeader = false;
                    continue;
                }

                String[] data = line.split(",");
                String id = data[0];

                // If ID already exists → duplicate
                if (!uniqueIds.add(id)) {
                    duplicatesFound = true;
                    System.out.println(
                            "ID: " + data[0] +
                            ", Name: " + data[1] +
                            ", Age: " + data[2] +
                            ", Marks: " + data[3]
                    );
                }
            }

            if (!duplicatesFound) {
                System.out.println("No duplicate records found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

