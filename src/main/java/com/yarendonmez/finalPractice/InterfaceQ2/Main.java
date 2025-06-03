package com.yarendonmez.finalPractice.InterfaceQ2;

public class Main {
    public static void main(String[] args) {
        LogManager logManager = new LogManager(new FileLogger());
        logManager.logEvent();


    }
}
