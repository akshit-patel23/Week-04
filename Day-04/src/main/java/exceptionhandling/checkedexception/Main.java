package exceptionhandling.checkedexception;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filepath="src/main/java/exceptionhandling/checkedexception/samplej";
        Checked ch= new Checked();
        ch.read(filepath);

    }
}
