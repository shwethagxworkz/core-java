package com.xworkz.yono.savings;

import jdk.nashorn.internal.parser.JSONParser;

public class BankAccount {

    private double balance;
        public double getbalance() {
        return balance;
    }
    public void debit(int amount) {

        if (balance > amount) {
            balance = balance - amount;
            System.out.println("The current balance is " + balance);
        }
    }
        public void credit(int amount){

        System.out.println("credit amount");
        this.balance=balance+amount;
            System.out.println("the balance amount is "+balance);
        }
    public void transfer(int amount,BankAccount benificiaryAccount)
    {
        this.debit(amount);
        benificiaryAccount.credit(amount);
    }
}
