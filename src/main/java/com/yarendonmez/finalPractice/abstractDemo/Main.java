package com.yarendonmez.finalPractice.abstractDemo;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager  = new CustomerManager();
        customerManager.dataBaseManager = new SqlServerDatabaseManagement();
        customerManager.getCustomer();
    }
}
