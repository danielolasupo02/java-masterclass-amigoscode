package com.daniel;


import java.util.ArrayList;

public class Bank{

    ArrayList<Account> accountList;


public Bank() {
    accountList  = new ArrayList<Account>();
}

    public void addAccount(Account acc) {
    accountList.add(acc);
}

public void removeAccount(Account acc) {
    accountList.remove(acc);
}

public void depositMoney(Account acc, int amount) {
    acc.deposit(amount);
}

public void withdrawMoney(Account acc, int amount) {
    acc.withdraw(amount);
}





}
