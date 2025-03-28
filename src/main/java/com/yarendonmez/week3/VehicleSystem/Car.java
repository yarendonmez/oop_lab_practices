package com.yarendonmez.week3.VehicleSystem;

public class Car extends Vehicle {

    //constructor for Car class inherit from Vehicle class
    public Car(String brand, String model) {
        super(brand, model);
    }


    @Override
    public void showInfo() {
        System.out.println("The car brand: " + brand);
        System.out.println("The car model: " + model);
    }
}
