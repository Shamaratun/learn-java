package classTwentyFirst;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class ReadTextFile {

        public static void main(String[] args) {
            // Path to the file
            String filePath ="C:\\Users\\Java Student PC-4\\Desktop\\JAVA\\HelloWorld";// Replace with the actual path of your file

            // Use BufferedReader to read the file
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line;

                // Read the file line by line
                while ((line = br.readLine()) != null) {
                    System.out.println(line);  // Print each line to the console
                }
            } catch (IOException e) {
                // Handle exceptions, e.g., file not found
                System.out.println("An error occurred while reading the file: " + e.getMessage());
            }
        }
    }


