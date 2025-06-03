package com.yarendonmez.finalPractice.InterfaceQ3;

public class Main {
    public static void main(String[] args) {
        PaymentManager paymentManager = new PaymentManager(new CreditCartPayment());
        paymentManager.payEvent();
    }
}
