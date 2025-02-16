package javastreams.datastreams;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WriteCode {
    public static void write(String path){
        try{
            DataInputStream dis=new DataInputStream(new FileInputStream(path));
            while(dis.available()>0){
                int roll= dis.readInt();
                String name= dis.readUTF();
                double cgpa= dis.readDouble();
                System.out.println("Name :- "+name+" , Roll Number :- "+roll+" , CGPA :- "+cgpa);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
