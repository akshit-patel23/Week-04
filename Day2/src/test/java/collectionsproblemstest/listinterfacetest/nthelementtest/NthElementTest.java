package collectionsproblemstest.listinterfacetest.nthelementtest;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static collectionsproblem.listinterfaceproblems.nthelement.nthElement.find;

public class NthElementTest {
    @Test
    public void Tester(){
        List<Integer> list=new ArrayList<>(Arrays.asList(2,3,4,5,6,7));
        int target=3;
        int ans=find(list,target);
        Assert.assertEquals(5,ans);
    }
}

