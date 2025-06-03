package com.yarendonmez.finalPractice.InterfaceQ3;

public class PaymentManager {

    private IPay payment;

    public PaymentManager(IPay payment){
        this.payment = payment;
    }

    public void payEvent(){
        payment.pay("Ödeme başarıyla alındı.");
    }
}
