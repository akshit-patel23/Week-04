package javastreams.serialization;

import java.io.*;
import java.util.List;

public class SerializationCode {
    public static void readWrite(String path, List<Employee> li){
        try{
            FileOutputStream fs=new FileOutputStream(path);
            ObjectOutputStream oos=new ObjectOutputStream(fs);
            oos.writeObject(li);
            oos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
     public static List<Employee> readFromFile(String path) {
        try (FileInputStream fis = new FileInputStream(path);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (List<Employee>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error while reading from file: " + e.getMessage());
        }
        return null;
    }
}
