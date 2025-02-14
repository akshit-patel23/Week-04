
package exceptionhandling.checkedexception;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;


public class Checked {
    public void read(String filepath){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line;
            while((line= reader.readLine())!=null){
                System.out.println(line);
            }
            reader.close();
        }
        catch (IOException e){
            System.out.println("File not Found "+e.getMessage());
        }

    }
}
