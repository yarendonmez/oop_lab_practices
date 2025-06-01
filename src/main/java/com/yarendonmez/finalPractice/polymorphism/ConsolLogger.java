package com.yarendonmez.finalPractice.polymorphism;

public class ConsolLogger extends BaseLogger{
    @Override
    public void log(String messages) {
        System.out.println("Consol Logger: "+ messages);
    }
}
