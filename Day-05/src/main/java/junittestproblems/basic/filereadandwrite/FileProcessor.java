package junittestproblems.basic.filereadandwrite;

import java.io.*;

public class FileProcessor {
    public static void writeToFile(String filename, String content) throws IOException {
        File file = new File(filename);

        if(!file.exists()){
            throw new IOException("File not exist!");

        }
        if (content == null) {
            throw new IOException("Content cannot be null.");
        } else {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
                bw.write(content);
                System.out.println("File written successfully.");
            } catch (IOException e) {
                throw new IOException("Error writing to file: ");
            }
        }}
    public static void readFromFile(String filename) throws IOException {
        File file = new File(filename);

        if(!file.exists()){
            throw new IOException("File not exist!");

        }
        else{
            BufferedReader br=new BufferedReader(new FileReader(file));
            String data;
            while((data = br.readLine()) != null){
                System.out.println(data);

            }
        }

    }
}
