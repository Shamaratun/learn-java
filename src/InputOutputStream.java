import java.io.*;

public class InputOutputStream {
    public static void main(String[] args) {
        // Using try-with-resources to handle automatic resource closing
        try (
                DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));
        ) {
            // Correct usage of the methods in DataOutputStream
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeUTF("Jim");
            output.writeDouble(185.5);
            output.writeUTF("George");
            output.writeDouble(105.25);

            // Using try-with-resources for reading the file
            try (
                    DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));
            ) {
                // Reading and printing values from the file
                System.out.println(input.readUTF() + " " + input.readDouble());
                System.out.println(input.readUTF() + " " + input.readDouble());
                System.out.println(input.readUTF() + " " + input.readDouble());
            } catch (IOException e) {
                System.err.println("Error reading from the file: " + e.getMessage());
            }
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
}
