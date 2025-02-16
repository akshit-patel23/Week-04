package basictest.timeouttest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static junittestproblems.basic.performancetesting.TimeOutClass.task;

public class TimeOutTest {
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    public void Tester() throws InterruptedException {
        String result = task();
        Assert.assertEquals("Task Completed", result);
    }
}
