package javastreams.linebyline;

import static javastreams.linebyline.ReadFile.ReadFileFunction;

public class ReadFileMain {
    public static void main(String[] args) {
        String path="src/main/java/javastreams/linebyline/Sample.txt";
        ReadFileFunction(path);

    }
}
