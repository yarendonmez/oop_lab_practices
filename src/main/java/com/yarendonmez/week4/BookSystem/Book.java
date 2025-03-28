package com.yarendonmez.week4.BookSystem;

public class Book {
    //Fields: title, author and pageCount
    String title;
    String author;
    int pageCount;

    //A constructor to initialize all field
    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    // A method showInfo() that prints book details
    public void showInfo() {
        System.out.println("Book Information:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page count:  " + pageCount);
    }
}
