package com.yarendonmez.week3.ManagerSystem;

//Inherit from Employee class
public class Manager extends Employee{
    //attribute of Employee
    String department;

    //constructor for Manager class
    public Manager(String name, double salary, String department){
        super(name, salary);
        this.department = department;
    }

    //Override printInfo()
    @Override
    public void printInfo() {
        //Normalde super önce çağrılır bunu biliyorum fakat ben önce departman ismini yazdırıp sonra bilgileri yazdırsın istediğim için önce bunu yazdım.
        System.out.println("Department: "+department);
        super.printInfo();
    }
}
