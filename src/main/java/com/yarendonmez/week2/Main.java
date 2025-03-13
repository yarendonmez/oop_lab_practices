package com.yarendonmez.week2;

public class Main {
    public static void main(String[] args) {
        Kedi myKedi = new Kedi("Gofret",3,"Tekir");
        System.out.println();
        Kopek myKopek = new Kopek("Rüzgar",5);
        System.out.println();
        Kus myKus = new Kus("Çapkın",1);

        System.out.println();//Boşluk için
        myKedi.sesCikar();
        System.out.println();
        myKopek.sesCikar();
        System.out.println();
        myKus.sesCikar();


    }
}
