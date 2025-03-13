package com.yarendonmez.week2;

public class Kus extends Hayvan {
    public Kus(String isim, int yas) {
        super(isim, yas);
        System.out.println("Kuş sınıfı oluşturuldu!");
    }

    @Override
    public void sesCikar(){
        super.sesCikar();
        System.out.println("Cik cik cik!"); //Kuş ötüşü :)
    }


}
