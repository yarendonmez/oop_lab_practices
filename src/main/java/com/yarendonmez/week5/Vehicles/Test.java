package com.yarendonmez.week5.Vehicles;

public class Test {
    public static void main(String[] args) {

        //Create objects
        Vehicle myCar = new Car();
        Vehicle myBicycle = new Bicycle();

        // Call methots
        myCar.ride();
        myCar.load();
        myCar.load(50);

        System.out.println();

        myBicycle.ride();
        myBicycle.load();
        myBicycle.load(3);


    }

}
