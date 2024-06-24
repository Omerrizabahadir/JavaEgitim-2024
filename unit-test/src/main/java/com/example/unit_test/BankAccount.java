package com.example.unit_test;
import java.util.HashMap;
import java.util.Map;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private Map<String, Double> transactions;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.transactions = new HashMap<>();
    }

    public String getAccountNumber() {

        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Map<String, Double> getTransactions() {
        return transactions;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than zero");
        }
        balance += amount;
        transactions.put("Deposit: " + amount, balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be greater than zero");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
        transactions.put("Withdraw: " + amount, balance);
    }

    public void transfer(BankAccount targetAccount, double amount) {
        if (targetAccount == null) {
            throw new IllegalArgumentException("Target account cannot be null");
        }
        this.withdraw(amount);
        targetAccount.deposit(amount);
        transactions.put("Transfer to " + targetAccount.getAccountNumber() + ": " + amount, balance);
    }
}
