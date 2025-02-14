package collectionsproblemstest.listinterfacetest.frequencytest;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static collectionsproblem.listinterfaceproblems.frequency.Frequency.frequencyMap;
import static org.junit.Assert.assertEquals;

public class FrequencyTest {
    @Test
    public void Tester(){
        List<String> list = Arrays.asList("Dev", "Singh", "Dev");

        Map<String, Integer> result = frequencyMap(list);

        Assert.assertEquals(2, result.size());
    }
}