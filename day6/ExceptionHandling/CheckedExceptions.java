package com.day6.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions {
	
    public static void main(String[] args) {
        try {
            // FileNotFoundException - Opening a non-existent file
            BufferedReader reader = new BufferedReader(new FileReader("nonexistent.txt"));

            // IOException - Handling reading and processing of the file
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Line from the file: " + line);
            }

            // Closing the reader
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Please Provide File to read: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
