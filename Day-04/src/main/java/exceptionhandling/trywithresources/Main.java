package exceptionhandling.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Ashika\\Desktop\\Week-04\\Day-04\\src\\main\\java\\exceptionhandling\\trywithresources\\bcbjv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}

