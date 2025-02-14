package collectionsproblemstest.setinterfacetest.checkforsetequaltest;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class CheckTest {
    @Test
    public void Tester(){
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s2.add(3);
        s2.add(2);
        s2.add(1);
        Assert.assertEquals(s1,s2);
    }

}