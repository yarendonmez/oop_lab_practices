package com.yarendonmez.finalPractice.polymorphism01;

public class EmailLogger extends BaseLogger {
    @Override
    public void log(String messages) {
        System.out.println("E-mail logger: " + messages);
    }
}
