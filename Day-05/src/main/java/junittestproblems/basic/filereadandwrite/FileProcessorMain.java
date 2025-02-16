package junittestproblems.basic.filereadandwrite;

import java.io.IOException;

import static junittestproblems.basic.filereadandwrite.FileProcessor.*;

public class FileProcessorMain {
    public static void main(String[] args) {
        String file="src/main/java/junittestproblems/basic/filereadandwrite/Sample.txt";
        try{
            writeToFile(file,"dev");
        }
        catch (IOException e){
            System.out.println("Error :- "+e.getMessage());
        }

        try{
            readFromFile(file);
        }catch (IOException e){
            System.out.println("Error :- "+e.getMessage());
        }
    }
}
