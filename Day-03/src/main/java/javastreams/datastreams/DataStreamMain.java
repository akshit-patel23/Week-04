package javastreams.datastreams;

import static javastreams.datastreams.ReadCode.read;
import static javastreams.datastreams.WriteCode.write;

public class DataStreamMain {
    public static void main(String[] args) {
        String path="src/main/java/javastreams/datastreams/Sample.txt";
        read(path);
        write(path);
    }
}
