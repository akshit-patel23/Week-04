package advancetest.usertest;

import junittestproblems.advance.user.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserTest {
    @Test
    public void Tester(){
       String name="Deepak";
        String email="Deepak@.com";
        String password="deijwooa";
        Exception exception= Assert.assertThrows(IllegalArgumentException.class,()-> new UserRegistration(name,email,password));
        Assert.assertEquals("Please enter Valid email!",exception.getMessage());
    }
    @Test
    public void Tester2(){
        String name=null;
        String email="Deepak@gmail.com";
        String password="deijwooa";
        Exception exception= Assert.assertThrows(IllegalArgumentException.class,()-> new UserRegistration(name,email,password));
        Assert.assertEquals("Please enter Valid username!",exception.getMessage());
    }
}
