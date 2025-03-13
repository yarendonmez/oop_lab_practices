package com.yarendonmez.week2;

public class Hayvan {
    String isim;
    int yas;

    //Constructor
    public Hayvan (String isim, int yas){
        this.isim = isim;
        this.yas = yas;
        System.out.println(isim + " adında ve "+yas+" yaşında bir hayvan oluşturuldu!");
    }
    //Ses çıkarma metodu
    public void sesCikar(){
        System.out.println("Hayvan ses çıkardı!");
    }

}
