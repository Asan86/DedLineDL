package com.company;

class LimitException extends Throwable {

    private double remainingAmount;

    LimitException(String s, double remainingAmount) {
    }
}
