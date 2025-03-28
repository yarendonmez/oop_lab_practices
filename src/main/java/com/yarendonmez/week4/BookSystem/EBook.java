package com.yarendonmez.week4.BookSystem;

//Create a subclass called EBook that inherits from Book.
public class EBook extends Book {
    //Extra fields
    double fileSize; //in MB
    String format; // e.g., PDF, EPUP

    //constructor to initialize inherited fields
    public EBook(String title, String author, int pageCount, double fileSize, String format) {
        super(title, author, pageCount);
        this.fileSize = fileSize;
        this.format = format;
    }

    // Override the showInfo() method:
    //Access the inherited variables using super.title, super.author, etc.
    @Override
    public void showInfo() {
        System.out.println("EBook Title: " + super.title);
        System.out.println("Author: " + super.author);
        System.out.println("Page Count: " + super.pageCount);
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Format: " + format);
    }

}
