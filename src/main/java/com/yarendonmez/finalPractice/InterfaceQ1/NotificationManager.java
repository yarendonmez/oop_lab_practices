package com.yarendonmez.finalPractice.InterfaceQ1;

public class NotificationManager {

    private INotifier notifier;

    public NotificationManager(INotifier notifier){
        this.notifier = notifier;
    }

    public void notifyUser(){
        notifier.send();
    }

}
