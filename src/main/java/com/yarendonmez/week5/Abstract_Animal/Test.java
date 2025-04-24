package com.yarendonmez.week5.Abstract_Animal;

public class Test {
    public static void main(String[] args) {
        // Cat nesnesi oluşturuluyor
        //Cat myCat = new Cat("Mia");
        //görgü kuralı polymorphism
        Animal myCat = new Cat("Mia");

        // Metotlar test ediliyor
        myCat.makeSound();  // Çıktı: Meow
        myCat.eat();        // Çıktı: Mia is eating.
    }
}