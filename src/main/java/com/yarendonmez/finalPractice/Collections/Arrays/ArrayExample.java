package com.yarendonmez.finalPractice.Collections.Arrays;


import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int sayilar[] = new int[] {1, 2, 3,200};
        sayilar[3]=4;
        sayilar[3]++;



        for (int i:sayilar){
            System.out.println(i);
        }
    }
}