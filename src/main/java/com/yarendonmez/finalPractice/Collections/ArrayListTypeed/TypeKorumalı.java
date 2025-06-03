package com.yarendonmez.finalPractice.Collections.ArrayListTypeed;

import java.util.ArrayList;
import java.util.Collections;

public class TypeKorumalı {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>(); //tip koruması sağlar
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("Adana");
        sehirler.add("Kırıkkale");
        sehirler.add("İzmir");
        sehirler.remove("Ankara");

        Collections.sort(sehirler);


        System.out.println("For each döngüsü:");
        for (String sehir:sehirler){
            System.out.println(sehir);
        }

        System.out.println("---------------------------");
        System.out.println("Genel for döngüsü:");
        for (int sehir=0; sehir<sehirler.size(); sehir++){
            System.out.println(sehirler.get(sehir));
        }

    }
}
