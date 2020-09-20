package com.company;

public class Main {
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        for (int i = 0; ; i++) {
            try {
                bankAccount.withDraw(6000);


            } catch (LimitException tt) {
                System.out.println(" Сейчас " + bankAccount.getAmount());
                try {
                    bankAccount.withDraw((int) bankAccount.getAmount());
                } catch (LimitException e) {
                    e.printStackTrace();
                }


                System.out.println(tt.getMessage());

                System.out.println(" Сейчас " + bankAccount.getAmount());
                break;
            }

        }
    }
}


