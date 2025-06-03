package com.yarendonmez.finalPractice.InterfaceQ1;

public class SmsNotifier implements INotifier{
    @Override
    public void send(){
        System.out.println("sms notification!");
    }
}
