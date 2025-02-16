package readuserinputfromconsole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadBufferReader {
    public static String[] getUserInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = reader.readLine();

        System.out.print("Enter your age: ");
        String age = reader.readLine();

        System.out.print("Enter your favorite programming language: ");
        String language = reader.readLine();

        return new String[]{name, age, language};
    }
}
