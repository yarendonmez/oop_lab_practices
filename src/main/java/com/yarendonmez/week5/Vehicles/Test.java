package com.yarendonmez.week5.Vehicles;

public class Test {
    public static void main(String[] args) {

        //Create objects
        Car myCar = new Car();
        Bicycle myBicycle = new Bicycle();

        // Call methots
        myCar.ride();
        myCar.load();
        myCar.load(50);
        System.out.println();

        myBicycle.ride();
        myBicycle.load();
        myBicycle.load(3);
        System.out.println();

    }

}
