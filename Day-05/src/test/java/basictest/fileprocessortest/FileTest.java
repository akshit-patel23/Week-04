package basictest.fileprocessortest;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static junittestproblems.basic.filereadandwrite.FileProcessor.*;

public class FileTest {
    @Test
    public void Tester(){
        String file="src/main/java/junittestproblems/basic/filereadandwrite/Sample.txt";

        Exception exception1= Assert.assertThrows(IOException.class,()->writeToFile(file,null));
        Exception exception2= Assert.assertThrows(IOException.class,()->writeToFile("efhwkj","Dev"));
        Exception exception3= Assert.assertThrows(IOException.class,()->readFromFile("3edjklm"));

        Assert.assertEquals("Content cannot be null.",exception1.getMessage());
        Assert.assertEquals("File not exist!",exception2.getMessage());
        Assert.assertEquals("File not exist!",exception3.getMessage());


    }
}
