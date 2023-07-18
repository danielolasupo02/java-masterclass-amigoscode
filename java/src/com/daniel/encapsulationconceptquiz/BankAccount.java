package com.daniel.encapsulationconceptquiz;

import java.math.BigDecimal;

public class BankAccount {
    private int accountNumber;
    private BigDecimal balance;

    public BankAccount(int accountNumber, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void printAccountDetails() {
        System.out.println("Account number: " + getAccountNumber());
        System.out.println("Account balance: " + "$" + getBalance());
        System.out.println("=========================");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
