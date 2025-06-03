package com.yarendonmez.finalPractice.InterfaceQ3;

public class CreditCartPayment implements IPay{
    @Override
    public void pay(String message) {
        System.out.println("Kredi Kartı Ödemesi: "+ message);
    }
}
