package com.jentech;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise17 {
    public static void main(String[] args) {
        try {
            // Provide the file path where the data.csv file is located
            String filePath = "src/data.csv";

            // Create a new BufferedReader to read the file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            // Read the file line by line and store it in a StringBuilder
            StringBuilder fileContents = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                fileContents.append(line).append("\n");
            }

            // Close the reader to release resources
            reader.close();

            // Display the contents of the file
            System.out.println("Contents of the file 'data.csv':");
            System.out.println(fileContents.toString());
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
