package com.jentech;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise18 {
    public static void main(String[] args) {
        try {
            // Provide the file path where the data.csv file is located
            String filePath = "src/data.csv";

            // Create a new BufferedReader to read the file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));


            // Read the file line by line and print each line
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the reader to release resources
            reader.close();
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

