package com.yarendonmez.finalPractice.InterfaceQ1;

public class EmailNotifier implements INotifier{
    @Override
    public void send(){
        System.out.println("Email notification!");
    }
}
