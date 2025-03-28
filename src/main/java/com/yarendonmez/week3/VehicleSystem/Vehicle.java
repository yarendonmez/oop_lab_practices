package com.yarendonmez.week3.VehicleSystem;

public class Vehicle {
    String brand;
    String model;

    //Constructor for Vehicle class
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    //Method to show information about vehicle
    public void showInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}
