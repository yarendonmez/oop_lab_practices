package com.yarendonmez.finalPractice.Abstract;

public abstract class GameCalculator {
    public abstract void  hesapla();

    //Override edilsin istemediğim metotlara final eklerim ve tüm classlar için aynı kullanılmak zorundadır.
    public final void gameOver(){
        System.out.println("Oyun bitti!");
    }
}

//Zorunlu ve farklı sınıflarda farklı şekilde kullanmam gereken metotlar varsa bunu abstract yaparım.
//Abstract tanımladığım bir fonksiyon abstract bir class içerisinde yer almalıdır.
//Abstract class içerisindeki her abstract metot o classı inherit eden tüm classlar içerisinde implement edilmek zorundadır.
//Abstract classda illa abstract metot olmak zorunda değil.
//Abstract classlar newlenemez newlemek için mainde newledikten sonra ezmek zorundayız. Ama iyi bir kullanım değildir önerilmez