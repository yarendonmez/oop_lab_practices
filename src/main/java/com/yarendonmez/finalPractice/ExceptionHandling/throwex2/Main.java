package com.yarendonmez.finalPractice.ExceptionHandling.throwex2;

public class Main {
    public static void main(String[] args)  {
        AccountManager account = new AccountManager();

        System.out.println("Hesap bakiyesi: "+ account.getBalance() +"\n------------------------------");

        account.deposit(100);

        try{
            account.withdraw(200);
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
        }

//        account.withdraw(20);

    }

