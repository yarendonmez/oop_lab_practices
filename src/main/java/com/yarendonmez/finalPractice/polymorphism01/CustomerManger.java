package com.yarendonmez.finalPractice.polymorphism01;

public class CustomerManger {
    private BaseLogger logger;

    public CustomerManger(BaseLogger logger) {
        this.logger = logger;
    }

    public void add(String name) {
        System.out.println("Müşteri: " +name+ " eklendi");
        this.logger.log("Log mesajı"); //BaseLogger türündeki logger nesnesi üzerinden log() metodu çağrılıyor.
    }

}
