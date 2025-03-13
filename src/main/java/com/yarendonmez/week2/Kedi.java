package com.yarendonmez.week2;

public class Kedi extends Hayvan {
    String cins;
    public Kedi(String isim, int yas, String cins) {
        super(isim, yas);
        System.out.println("Kedi sınıfı oluşturuldu!");
          this.cins = cins;
    }

    @Override
    public void sesCikar(){
        super.sesCikar();
        System.out.println("Miyav miyav!");
    }


}
