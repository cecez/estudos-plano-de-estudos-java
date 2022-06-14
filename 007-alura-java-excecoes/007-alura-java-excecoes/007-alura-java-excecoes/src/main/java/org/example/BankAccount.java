package org.example;

public abstract class BankAccount {
    private double balance = 0;
    private int agency;
    private int number;
    private BankClient bankClient;
    private boolean active = true;
    private char code;

    private static int totalAccounts = 0;

    public BankAccount(int agency, int number) {
        this.agency = agency;
        this.number = number;

        BankAccount.totalAccounts++;
    }

    public boolean getActive() {
        return this.active;
    }

    public double balance() {
        return this.balance;
    }

    public void deposit(double value) {
        if (value > 0) {
            this.balance += value;
        }
    }

    public void withdraw(double value) {
        if (value > this.balance) {
            throw new InsuficientBalanceException("Saldo insuficiente");
        }

        this.balance -= value;
    }

    public void transfer(double value, BankAccount destinationAccount) {
        withdraw(value);
        destinationAccount.deposit(value);
    }

    public static int getTotalAccounts() {
        return BankAccount.totalAccounts;
    }

}
