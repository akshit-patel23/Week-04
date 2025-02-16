package advancetest.datetest;

import static junittestproblems.advance.date.Date.check;
import org.junit.Assert;
import org.junit.Test;

public class DateTest {
    @Test
    public void Tester(){
     Exception exception= Assert.assertThrows(IllegalArgumentException.class,()-> check("2003-023'2"));
     Assert.assertEquals("Date format is incorrect, please use (yyyy-MM-dd)",exception.getMessage());
    }
}
