package com.yarendonmez.GenericsDemos.FirstExample;

public class Main {
    public static void main(String[] args) {
        MyList<Customer> customers = new MyList<Customer>();
        Customer myCustomer = new Customer("Yaren", 33434);

        customers.add(myCustomer);


    }
}
