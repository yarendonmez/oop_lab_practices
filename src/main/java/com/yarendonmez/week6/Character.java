package com.yarendonmez.week6;

// 2. Character adında soyut (abstract) bir sınıf tanımlıyoruz
abstract class Character {
    // Saldırı için soyut metod — bu metod mutlaka alt sınıflarda override edilmelidir.
    abstract void attack();

    // Savunma için somut (concrete) metod — doğrudan çalıştırılabilir
    void defend() {
        System.out.println("Character defends!");
    }

}
