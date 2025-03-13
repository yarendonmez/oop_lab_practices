package com.yarendonmez.week2;

public class Kopek extends Hayvan {
    public Kopek(String isim, int yas) {
        super(isim, yas);
        System.out.println("Köpek sınıfı oluşturuldu!");
    }

    @Override
    public void sesCikar(){
        super.sesCikar();
        System.out.println("Hav hav!");
    }


}
