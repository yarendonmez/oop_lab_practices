package com.yarendonmez.week3.VehicleSystem;

public class Motorcyle extends Vehicle {

    //constructor for Motorcycle class inherit from Vehicle class
    public Motorcyle(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void showInfo() {
        System.out.println("The motorcycle brand: " + brand);
        System.out.println("The motorcycle model: " + model);
    }
}
