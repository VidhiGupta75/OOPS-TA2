import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingDemo {
    public static void main(String[] args) {
        String fileName = "example.txt";

        // 1. Create a file
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

        // 2. Write to the file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello, this is a sample file.\n");
            writer.write("File handling in Java is simple!");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // 3. Read from the file
        try (FileReader reader = new FileReader(fileName)) {
            int character;
            System.out.println("Contents of the file:");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
