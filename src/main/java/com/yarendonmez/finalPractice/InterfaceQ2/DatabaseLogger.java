package com.yarendonmez.finalPractice.InterfaceQ2;

public class DatabaseLogger implements ILogger{
    @Override
    public void log(String message) {
        System.out.println("Veritabanına loglandı: "+ message);

    }
}
