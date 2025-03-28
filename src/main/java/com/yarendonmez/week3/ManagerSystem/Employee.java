package com.yarendonmez.week3.ManagerSystem;

public class Employee {
    //Employee attributes
    String name;
    double salary;

    //Create constructor for employee
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    //printInfo method
    public void printInfo() {
        System.out.println("Employee information:");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("----------------------");
    }

}
