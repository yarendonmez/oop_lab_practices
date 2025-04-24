package com.yarendonmez.midtermPractice.UML2;

import java.sql.SQLOutput;

public class Car {
    private String carColor;
    private double carPrice;

    //getter carColor
    public String getCarColor(String model){
        System.out.println(model + " için arama yapılıyor...");
        return carColor;
    }

    //setter carColor
    public String setCarColor(String carColor){
        this.carColor = carColor;
        return this.carColor;
    }

}
class CarTest{
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setCarColor("Black");
        String myCarColor = myCar.getCarColor("BMW");

        System.out.println(myCarColor);
    }
}