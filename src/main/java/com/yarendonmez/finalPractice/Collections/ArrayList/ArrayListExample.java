package com.yarendonmez.finalPractice.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();
        // sayilar.add(1,2,3,4,5,6); hatalı
        sayilar.add("Yaren");
        sayilar.add(23);
        sayilar.add("Gazi Üniversitesi");
        int sizeOfSayilar  = sayilar.size();
        System.out.println("Array list boyutu: " + sizeOfSayilar);//Array list boyutu: 3
        System.out.println(sayilar.get(2)); //Gazi Üniversitesi
        System.out.println(sayilar.set(2,"Boğaziçi Üniversitesi")); //eski değeri döndürür
        sayilar.set(0,"Yaren Dönmez"); //değer döndürmez
        System.out.println(sayilar);

    }
}
