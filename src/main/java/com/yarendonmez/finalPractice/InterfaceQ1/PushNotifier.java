package com.yarendonmez.finalPractice.InterfaceQ1;

public class PushNotifier implements INotifier{
    @Override
    public void send() {
        System.out.println("Push Notification");
    }
}
