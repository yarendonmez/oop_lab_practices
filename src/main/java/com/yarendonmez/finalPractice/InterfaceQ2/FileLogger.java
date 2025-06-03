package com.yarendonmez.finalPractice.InterfaceQ2;

public class FileLogger implements ILogger{
    @Override
    public void log(String message) {
        System.out.println("Dosya loglandı: "+message);

    }
}
