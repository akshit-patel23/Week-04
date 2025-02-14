package collectionsproblemstest.listinterfacetest.removetest;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static collectionsproblem.listinterfaceproblems.remove.Remove.remove;

public class RemoveTest {
    @Test
    public void Tester(){
        List<Integer> list=new ArrayList<>(Arrays.asList(2,3,3,3,3,4,5,6,7,8));
        List<Integer> result=remove(list);
        List<Integer> ans=new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8));
        Assert.assertEquals(ans,result);

    }

}

