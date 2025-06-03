package com.yarendonmez.finalPractice.InterfaceQ3;

public class CyriptoPayment implements IPay{
    @Override
    public void pay(String message) {
        System.out.println("PayPall Ödemesi: "+message);
    }
}
