package collectionsproblemstest.setinterfacetest.subsettest;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static collectionsproblem.setinterfaceproblems.subset.SubsetFunction.subsetFunction;

public class SubsetTest {
    @Test
    public void Tester(){
        Set<Integer> s1=new HashSet<>();
        s1.add(11);
        s1.add(3);
        s1.add(2);
        s1.add(4);
        Set<Integer> s2=new HashSet<>();

        s2.add(3);
        s2.add(2);
        s2.add(4);

        Boolean result=subsetFunction(s1,s2);
        Assert.assertEquals(true,result);
    }
}