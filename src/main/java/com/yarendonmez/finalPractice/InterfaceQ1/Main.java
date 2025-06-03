package com.yarendonmez.finalPractice.InterfaceQ1;

public class Main {
    public static void main(String[] args) {
        NotificationManager notificationManager = new NotificationManager(new PushNotifier());
        notificationManager.notifyUser();
    }
}
