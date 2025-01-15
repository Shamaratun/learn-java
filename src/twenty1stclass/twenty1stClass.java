package twenty1stclass;

import java.io.File;
import java.text.SimpleDateFormat;

public class twenty1stClass {




        public static void main(String[] args) {
            // Path to the file
            String filePath = "C:\\Users\\Java Student PC-4\\Desktop\\JAVA\\HelloWorld";

            // Create a File object
            File file = new File(filePath);

            // Check if the file exists
            if (file.exists()) {
                // Get the last modified time in milliseconds
                long lastModified = file.lastModified();

                // Create a SimpleDateFormat to format the date
                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");


                String formattedDate = sdf.format(lastModified);


                System.out.println("Last Modified Date: " + formattedDate);
            } else {
                System.out.println("The file does not exist.");
            }
        }
    }


