package collectionsproblemstest.mapinterfacetest.bankingtest;

import collectionsproblem.mapinterfaceproblems.bankingsystem.BankingSystem;
import org.junit.Assert;
import org.junit.Test;

public class BankingTest {
    @Test
    public void Tester(){
        BankingSystem bank = new BankingSystem();

        // Adding accounts
        bank.addAccount("ACC123", 5000.0);
        bank.addAccount("ACC456", 3000.0);
        bank.addAccount("ACC789", 7000.0);

        // Request withdrawals
        bank.requestWithdrawal("ACC123");
        bank.requestWithdrawal("ACC456");

        // Process withdrawals
        bank.processWithdrawals(2000.0);
        Assert.assertEquals(1000.0,bank.getAmount("ACC456"),0.01);
    }
}
