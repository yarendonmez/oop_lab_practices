package com.yarendonmez.week2;

public class Kedi extends Hayvan {
    public Kedi(String isim, int yas) {
        super(isim, yas);
//        this.cins = cins; sonra denemek için yoruma çektim

        System.out.println("Kedi sınıfı oluşturuldu!");
    }

    @Override
    public void sesCikar(){
        super.sesCikar();
        System.out.println("Miyav miyav!");
    }


}
