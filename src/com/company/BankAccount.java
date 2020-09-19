package com.company;

import java.util.Scanner;

public class BankAccount {
    double amount;

    public double getAmount() {       //возвращяет текущий остаток на счете
        return amount;
    }

    public double deposit() {         // положить деньги на счет
        System.out.println("Вставьте суммму денег:");
        Scanner sc = new Scanner(System.in);
        double sum = sc.nextDouble();
        System.out.println("вы пополнили счет на :" + sum);
        return amount = amount + sum;
    }

    public double withDraw() {       //снимает указанную сумму со счета
        System.out.println("укажите сумму которую хтите снять: ");
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        System.out.println("вы сняли :" + sum);
        if (amount > 0) {
            amount = amount - sum;
            if (amount < 0) {
                amount = amount - amount;
            }
        }

        if (amount < sum) {
            try {
                throw new LimitException("Лимит исчерпан", amount);
            } catch (LimitException e) {
                e.printStackTrace();
            }
        }
        System.out.println("остаток: " + amount);
        return amount;
    }

    public String setAmount(double amount) {
        this.amount = amount;
        return null;
    }
}
