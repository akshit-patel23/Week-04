package javastreams.countwords;


import java.util.Map;
import java.util.TreeMap;


public class CountWordMain {
    public static void main(String[] args) {
        String path="src/main/java/javastreams/countwords/Sample.txt";
        Map<String,Integer> m1=new TreeMap<>();
        CountWord.readWrite(path,m1);


    }
}
