package com.daniel;


import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Olasupo", BigDecimal.TEN, false);
        account.setBalance(new BigDecimal("100")) ;
        System.out.println(account.withdraw(new BigDecimal("9.0")));

        System.out.println(account.getBalance());
    }



}








