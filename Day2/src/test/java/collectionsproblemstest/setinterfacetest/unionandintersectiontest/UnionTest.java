package collectionsproblemstest.setinterfacetest.unionandintersectiontest;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static collectionsproblem.setinterfaceproblems.symmetricdifference.Difference.difference;
import static collectionsproblem.setinterfaceproblems.unionandintersection.UnionSet.union;

public class UnionTest {
    @Test
    public void Tester(){
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s2.add(3);
        s2.add(4);
        Set<Integer> setUnion=union(s1,s2);
        Set<Integer> ans=new HashSet<>(Arrays.asList(1,2,3,4));
        Assert.assertEquals(ans,setUnion);
    }
}