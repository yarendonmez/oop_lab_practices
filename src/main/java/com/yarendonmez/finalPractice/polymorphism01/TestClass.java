package com.yarendonmez.finalPractice.polymorphism01;

public class TestClass {
    public static void main(String[] args) {
        CustomerManger customerManger = new CustomerManger(new ConsolLogger());
        //Burada ConsoleLogger, BaseLogger sınıfından türeyen bir sınıf olmalı.
        //
        //Yani polymorphism kullanıyorsun 👑
        //
        //Constructor injection yapıyorsun → bağımlılık dışarıdan veriliyor (bağımlılıkları azaltır).
        customerManger.add("Yaren Dönmez");

    }
}
