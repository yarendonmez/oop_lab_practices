package com.yarendonmez.week3.VehicleSystem;

public class Main {
    public static void main(String[] args) {
        //Create a new car and motorcycle object
        Car myCar = new Car("Mercedes", "Maybach SL 680");
        Motorcyle myMotorcyle = new Motorcyle("Honda", "CBR1000RR-R Fireblade SP");

        //Call showInfo()
        myCar.showInfo();
        myMotorcyle.showInfo();

    }
}
