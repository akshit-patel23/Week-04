package collectionsproblemstest.setinterfacetest.symmetricdifferencetest;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static collectionsproblem.setinterfaceproblems.symmetricdifference.Difference.difference;

public class SymmetricTest {
    @Test
    public void tester(){
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s2.add(3);
        s2.add(4);
        Set<Integer> ans = difference(s1,s2);
        Set<Integer> result=new HashSet<>(Arrays.asList(1,2,4));
        Assert.assertEquals(result,ans);
    }
}