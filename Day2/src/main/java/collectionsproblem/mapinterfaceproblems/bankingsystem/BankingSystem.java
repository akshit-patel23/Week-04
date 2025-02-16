package collectionsproblem.mapinterfaceproblems.bankingsystem;

import java.util.*;

public class BankingSystem {
    private Map<String, BankingAccount> accounts = new HashMap<>();
    private Queue<String> withdrawalQueue = new LinkedList<>();
    private TreeMap<Double, BankingAccount> sortedAccounts;

    // Add a new account
    public void addAccount(String accountNumber, double balance) {
        accounts.put(accountNumber, new BankingAccount(accountNumber, balance));
    }

    // Process a withdrawal request
    public void requestWithdrawal(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.offer(accountNumber);
        } else {
            System.out.println("Account not found!");
        }
    }

    // Execute pending withdrawals
    public void processWithdrawals(double amount) {
        while (!withdrawalQueue.isEmpty()) {
            String accountNumber = withdrawalQueue.poll();
            BankingAccount account = accounts.get(accountNumber);

            if (account.withdraw(amount)) {
                System.out.println("Withdrawal of $" + amount + " processed for Account: " + accountNumber);
            } else {
                System.out.println("Insufficient funds for Account: " + accountNumber);
            }
        }
    }

    // Display accounts sorted by balance
    public void displaySortedAccounts() {
        sortedAccounts = new TreeMap<>();
        for (BankingAccount account : accounts.values()) {
            sortedAccounts.put(account.getBalance(), account);
        }

        System.out.println("\nAccounts Sorted by Balance:");
        for (Map.Entry<Double, BankingAccount> entry : sortedAccounts.entrySet()) {
            System.out.println(entry.getValue());
        }

    }
    public double getAmount(String accountNumber) {
        BankingAccount account = accounts.get(accountNumber);
        return (account != null) ? account.getBalance() : 0.0;
    }


}
