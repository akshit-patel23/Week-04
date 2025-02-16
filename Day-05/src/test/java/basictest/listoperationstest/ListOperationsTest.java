package basictest.listoperationstest;

import junittestproblems.basic.listoperation.ElementNotPresent;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junittestproblems.basic.listoperation.ListManager.*;

public class ListOperationsTest {
    @Test
    public void Tester(){
        List<Integer> list=new ArrayList<>(Arrays.asList());
        Exception exception1= Assert.assertThrows(ElementNotPresent.class,()->removeElement(list,5));
        Exception exception2= Assert.assertThrows(ElementNotPresent.class,()->getSize(list));

        Assert.assertEquals("Please enter valid element",exception1.getMessage());
        Assert.assertEquals("No element present in list!",exception2.getMessage());

    }
}
