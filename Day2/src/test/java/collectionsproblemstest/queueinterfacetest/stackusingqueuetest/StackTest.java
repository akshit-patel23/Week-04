package collectionsproblemstest.queueinterfacetest.stackusingqueuetest;

import collectionsproblem.queueinterfaceproblems.stackusingqueue.StackUsingQueue;
import org.junit.Assert;
import org.junit.Test;

public class StackTest {
    @Test
    public void Tester(){
        StackUsingQueue stack=new StackUsingQueue();
        stack.push(5);
        stack.push(3);
        stack.push(2);
        Assert.assertEquals(2,stack.pop());
    }
}
