package com.yarendonmez.week1;

public class Rectangle {
    double widht; //widht of rectangle
    double height; //height of rectangle

    Rectangle(double widht, double height){
        this.widht = widht;
        this.height = height;
    }

    //Alan hesaplayan fonksiyon
    void calculateArea(){
        double area = widht*height;
        System.out.println("Dikdörtgenin alanı: "+area);
    }

    //Çevre hesaplayan fonksiyon
    void calculatePerimeter(){
        double perimeter = 2*(widht+height);
        System.out.println("Dikdörtgenin çevresi: "+perimeter);
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2,3);
        rectangle1.calculatePerimeter();
        rectangle1.calculateArea();
    }

}
