package com.yarendonmez.finalPractice.InterfaceQ3;

public class PayPallPayment implements IPay{
    @Override
    public void pay(String message) {
        System.out.println("Pay Pall Ödemesi: "+message);
    }
}
