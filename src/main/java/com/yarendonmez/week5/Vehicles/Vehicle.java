package com.yarendonmez.week5.Vehicles;

public class Vehicle {
    //Ride methot for Vehicle
    public void ride() {
        System.out.println("The vehicle is moving!");
    }

    //Methot to load of vehicle
    public void load() {
        System.out.println("Loading vehicle...");
    }

    //Methot to load of vehicle with weight
    public void load(int weight) { //parameter should be kg
        System.out.println("Loading vehicle with " + weight + " kg");
    }
}
