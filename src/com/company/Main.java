package com.company;

public class Main {


    public static void main(String[] args) {
        // write your code here
        BankAccount bank = new BankAccount();

        bank.deposit();
        for (int i = 0;; i++) {
            bank.withDraw();
        }

    }

}
