package advancetest.passwordtest;

import junittestproblems.advance.passwordstrength.Password;
import org.junit.Assert;
import org.junit.Test;

public class PasswordTest {
    @Test
    public void Tester(){
Exception exception= Assert.assertThrows(IllegalArgumentException.class,()-> new Password("echxwnjq"));
Assert.assertEquals("Please enter valid password",exception.getMessage());
    }
}
