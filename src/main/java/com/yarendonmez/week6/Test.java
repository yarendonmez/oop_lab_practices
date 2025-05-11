package com.yarendonmez.week6;

// 4. Test adında ana sınıfı yazıyoruz — main metod burada olacak
public class Test {
    public static void main(String[] args) {

        // Hero sınıfından bir nesne oluşturuyoruz
        Hero myHero = new Hero();

        // İstenen sırayla metodları çağırıyoruz
        myHero.attack();
        myHero.defend();
        myHero.escape();
        myHero.hide();

    }
}
