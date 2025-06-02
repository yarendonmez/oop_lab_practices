package com.yarendonmez.finalPractice.polymorphism01;

public class FileLogger extends BaseLogger {
    public void log(String message) {
        System.out.println("File logger: " + message);
    }
}
