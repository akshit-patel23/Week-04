package basictest.stringutilitytest;

import junittestproblems.basic.stringutility.NotPalindrome;
import org.junit.Assert;
import org.junit.Test;

import static junittestproblems.basic.stringutility.StringUtility.*;

public class StringTest {
    @Test
    public void Tester1() {
        String input = "";

        Exception exception1 = Assert.assertThrows(IllegalArgumentException.class, () -> reverseMethod(input));
        Exception exception2 = Assert.assertThrows(NotPalindrome.class, () -> palindrome(input));
        Exception exception3 = Assert.assertThrows(IllegalArgumentException.class, () -> uppercase(input));

        Assert.assertEquals("Please Enter valid String", exception1.getMessage());
        Assert.assertEquals("The String is not a Palindrome", exception2.getMessage());
        Assert.assertEquals("Please Enter valid String", exception3.getMessage());
    }
}
