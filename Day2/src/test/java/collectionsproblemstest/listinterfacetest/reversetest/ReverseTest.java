package collectionsproblemstest.listinterfacetest.reversetest;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static collectionsproblem.listinterfaceproblems.reverse.Reverse.reverse;

public class ReverseTest {
    @Test
    public void Tester(){
        List<Integer> list=new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8));
        List<Integer> result=reverse(list);
        List<Integer> ans=new ArrayList<>(Arrays.asList(8,7,6,5,4,3,2));
        Assert.assertEquals(ans,result);

    }

}

