package collectionsproblem.mapinterfaceproblems.bankingsystem;

public class BankAccountMain {
    public static void main(String[] args) {
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

        // Display sorted accounts
        bank.displaySortedAccounts();
    }
    }

