package javastreams.datastreams;

import java.io.*;

public class ReadCode {
    public static void read(String path){
        try{
            DataOutputStream dos=new DataOutputStream(new FileOutputStream(path));
            dos.writeInt(101);
            dos.writeUTF("Deepak Singh");
            dos.writeDouble(8.7);

            dos.writeInt(102);
            dos.writeUTF("Rahul Sharma");
            dos.writeDouble(9.1);

            dos.writeInt(103);
            dos.writeUTF("Priya Mehta");
            dos.writeDouble(8.5);

            System.out.println("✅ Student details saved successfully!\n");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
