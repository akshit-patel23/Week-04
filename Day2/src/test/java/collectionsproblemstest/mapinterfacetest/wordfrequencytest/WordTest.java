package collectionsproblemstest.mapinterfacetest.wordfrequencytest;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

import static collectionsproblem.mapinterfaceproblems.wordfrequency.WordFrequency.frequency;

public class WordTest {
    @Test
    public void Tester(){
        String input="Hello world, hello Java";
        Map<String,Integer> map= frequency(input);
        Assert.assertEquals(3,map.size());
    }
}
