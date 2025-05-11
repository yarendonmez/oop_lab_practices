package com.yarendonmez.week6;

// 3. Hero adında bir sınıf oluşturuyoruz
// Character sınıfını genişletiyor (extends) ve Survivor arayüzünü uyguluyor (implements)
public class Hero extends Character implements Survivor {
    // attack() metodunu override ediyoruz
    @Override
    void attack() {
        System.out.println("Hero attacks with sword."
        );
    }

    // escape() metodunu override ediyoruz
    public void escape() {
        System.out.println("Hero escapes using grappling hook.");
    }

    // hide() metodunu override ediyoruz
    public void hide() {
        System.out.println("Hero hides behind the shield.");
    }
}
