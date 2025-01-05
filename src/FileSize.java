package twenty1stclass;

import java.io.File;

    public class FileSize {

        public static void main(String[] args) {
            // Path to the file
            String filePath = "C:\\Users\\Java Student PC-4\\Desktop\\JAVA\\HelloWorld";

            // Create a File object
            File file = new File(filePath);

            // Check if the file exists
            if (file.exists()) {
                // Get the size of the file in bytes
                long fileSize = file.length();

                // Print the file size in bytes
                System.out.println("File Size: " + fileSize + " bytes");
            } else {
                System.out.println("The file does not exist.");
            }
        }
    }

