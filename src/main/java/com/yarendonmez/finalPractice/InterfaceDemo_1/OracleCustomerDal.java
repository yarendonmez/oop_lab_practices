package com.yarendonmez.finalPractice.InterfaceDemo_1;

public class OracleCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("Oracle eklendi");
    }
}
