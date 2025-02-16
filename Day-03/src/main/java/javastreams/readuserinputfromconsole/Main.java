import readuserinputfromconsole.ReadBufferReader;
import readuserinputfromconsole.WriteFileWriter;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "ak.txt";
        try {
            String[] userData = ReadBufferReader.getUserInput();
            WriteFileWriter.saveToFile(fileName, userData);
        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }
    }
}
