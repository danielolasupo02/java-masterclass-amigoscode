package com.daniel;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

       //IMPLICIT TYPE CASTING -- WIDENING
        System.out.println("IMPLICIT TYPE CASTING");
        int balance = 1_000;
        double balanceToDouble = balance;
        System.out.println(balance);
        System.out.println(balanceToDouble);

        //EXPLICIT TYPE CASTING -- NARROWING
        System.out.println("EXPLICIT TYPE CASTING");
        double doubleBalance = 10000.0005;
        int doubleBalanceToInt = (int) doubleBalance;
        System.out.println(doubleBalance);
        System.out.println(doubleBalanceToInt);



    }


}



