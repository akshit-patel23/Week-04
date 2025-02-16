package collectionsproblemstest.queueinterfacetest.circularbuffertest;

import collectionsproblem.queueinterfaceproblems.circularbuffer.Buffer;
import org.junit.Assert;
import org.junit.Test;

public class CircularTest {@Test
    public void Tester(){
    Buffer cb = new Buffer(3);

    cb.insert(1);
    cb.insert(2);
    cb.insert(3);
    cb.display();

    cb.insert(4);
    cb.display();

    cb.insert(5);
    cb.display();

    Assert.assertEquals(3,cb.peek());
}
}
