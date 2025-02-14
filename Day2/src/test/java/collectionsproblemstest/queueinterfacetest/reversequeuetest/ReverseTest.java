package collectionsproblemstest.queueinterfacetest.reversequeuetest;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

import static collectionsproblem.queueinterfaceproblems.reversequeue.ReverseFunction.reverseFunction;

public class ReverseTest {
    @Test
    public void Tester(){
        Queue<Integer> q1=new LinkedList<>();
        q1.add(2);
        q1.add(3);
        q1.add(4);
        reverseFunction(q1);
        Queue<Integer> q2=new LinkedList<>();
        q2.add(4);
        q2.add(3);
        q2.add(2);
        Assert.assertEquals(q2,q1);

    }
}