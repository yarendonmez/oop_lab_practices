package com.yarendonmez.finalPractice.ExceptionHandling.CustomExceptionDemo;

public class AccountManager {
    private double balance;

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Hesaba yatan tutar: "+amount);
        System.out.println("Güncel hesap bakiyesi: "+ balance);
        System.out.println("--------------------------------");
    }

    public void withdraw(double amount) throws BalanceInsaficitionException{
        if (balance>=amount){
            balance -= amount;
            System.out.println("Hesaptan çekilen tutar: "+amount);
            System.out.println("Güncel hesap bakiyesi: "+ balance);
        }else throw new BalanceInsaficitionException("Bakiye yetersiz");

        System.out.println("--------------------------------");
    }
}
