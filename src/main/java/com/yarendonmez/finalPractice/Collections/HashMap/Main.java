package com.yarendonmez.finalPractice.Collections.HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //sözlük gibi düşünülebilir
        HashMap<String, String> sozluk = new HashMap<String,String>();
        sozluk.put("Book", "Kitap");
        sozluk.put("Table", "Masa");
        sozluk.put("Pen", "Kalem");

//        System.out.println(sozluk);
//        System.out.println(sozluk.get("Table"));
//        sozluk.remove("Table");
//        System.out.println(sozluk.get("Table"));//null

        for (String item:sozluk.keySet()){
            System.out.println("Key: "+item+" ---> Value: "+ sozluk.get(item));

        }

//        sozluk.clear();
//        System.out.println(sozluk);
//        System.out.println(sozluk.size());



    }

}
