package readuserinputfromconsole;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileWriter {
    public static void saveToFile(String fileName, String[] data) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Name: " + data[0] + "\n");
            writer.write("Age: " + data[1] + "\n");
            writer.write("Favorite Programming Language: " + data[2] + "\n");

            System.out.println("User information saved successfully to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
