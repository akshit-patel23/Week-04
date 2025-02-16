package basictest.dividetest;

import org.junit.Assert;
import org.junit.Test;

import static junittestproblems.basic.exceptionhandling.Divide.divide;

public class DivideTest {
    @Test
    public void Tester(){
        Exception exception= Assert.assertThrows(ArithmeticException.class,()->divide(2,0));
        Assert.assertEquals("Number is divided by zero",exception.getMessage());
    }
}
