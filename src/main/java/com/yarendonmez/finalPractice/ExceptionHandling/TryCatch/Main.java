package com.yarendonmez.finalPractice.ExceptionHandling.TryCatch;

public class Main {
    public static void main(String[] args) {
        try{
            int[] sayilar = {1,2,3,4};
            System.out.println(sayilar[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);

        }catch (Exception e) {
            System.out.println("test");
        }
        finally {
            System.out.println("Ben her türlü çalışırım");
        }
    }
}
