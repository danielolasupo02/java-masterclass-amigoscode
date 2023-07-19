package com.daniel.inheritanceconceptquiz;

import java.math.BigDecimal;

public class SavingsAccount extends BankAccount{
    String accountNumber;
    double balance;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void displayBalance() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Balance: " + getBalance());
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        if (super.getBalance()-amount <= 100) {
            System.out.println("Insufficient funds");
        }
        else {
            super.withdraw(amount);
        }

    }

}
