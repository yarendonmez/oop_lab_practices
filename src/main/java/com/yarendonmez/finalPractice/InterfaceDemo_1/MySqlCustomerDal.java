package com.yarendonmez.finalPractice.InterfaceDemo_1;

public class MySqlCustomerDal implements ICustomerDal {
    @Override
    public void add() {
        System.out.println("My sql eklendi");
    }
}
