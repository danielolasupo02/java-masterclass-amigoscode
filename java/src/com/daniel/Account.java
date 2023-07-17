package com.daniel;



public class Account{

    private String name;
    private int accountNumber;
    private int balance;

    public Account(String name, int accountNumber, int balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void getAccountDetails() {
        System.out.println("Account name: " + getName());
        System.out.println("Account number: " + getAccountNumber());
        System.out.println("Account balance: " + getBalance());
        System.out.println("========================");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


}
