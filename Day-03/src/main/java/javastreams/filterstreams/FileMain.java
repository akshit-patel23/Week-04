package javastreams.filterstreams;

import static javastreams.filterstreams.FileWrite.fileWriteRead;

public class FileMain {
    public static void main(String[] args) {
        String inputFile = "src/main/java/javastreams/filterstreams/Sample1.txt";
        String outputFile = "src/main/java/javastreams/filterstreams/Sample2.txt";

        fileWriteRead(inputFile, outputFile);
    }
}
