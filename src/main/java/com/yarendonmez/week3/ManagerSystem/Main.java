package com.yarendonmez.week3.ManagerSystem;

public class Main {
    public static void main(String[] args) {

        //Create a new Employee and Manager object
        Employee employee1 = new Employee("Yaren", 100000.0);
        Manager manager1 = new Manager("Zeynep",150000.0,"Lecturer");

        //call printInfo method
        employee1.printInfo();
        manager1.printInfo();

    }
}
