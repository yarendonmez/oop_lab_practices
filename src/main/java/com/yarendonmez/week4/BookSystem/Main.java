package com.yarendonmez.week4.BookSystem;

public class Main {
    public static void main(String[] args) {
        //create an EBook object
        EBook eBook = new EBook("Kablolardaki Hayalet", "Kevin David Mitnick", 480, 30.93, "PDF");

        //call its showInfo() method.
        eBook.showInfo();


    }
}
