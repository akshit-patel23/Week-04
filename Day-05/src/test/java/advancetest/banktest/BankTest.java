package advancetest.banktest;

import junittestproblems.advance.bankingtransactions.Bank;
import org.junit.Assert;
import org.junit.Test;

public class BankTest {
    @Test
    public void Tester(){
        Bank customer=new Bank(2000,"Dev");

        Exception exception= Assert.assertThrows(IllegalArgumentException.class,()->customer.setWithdrawl(5000));
        Assert.assertEquals("Your account has insufficient balance",exception.getMessage());
    }

}
