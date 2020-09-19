package com.company;

class LimitException extends Throwable {
    String message;
    double remainingAmount;

    LimitException(String message, double remainingAmount) {
    }

    private void getRemainingAmount() {

    }
}
