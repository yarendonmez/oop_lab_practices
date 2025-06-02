package com.yarendonmez.finalPractice.Collections.ArrayListTypeed;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(001, "Yaren"));
        customers.add(new Customer(002, "Zeynep"));
        customers.add(new Customer(003, "Uraz"));

        for (Customer customer:customers){
            //System.out.println(customer.FirstName()); //private olduğu için bu şekilde ulaşamam
            System.out.println("Customer ID: " + customer.getId() + "\nCustomer First Name: " + customer.getFirstName());
            System.out.println("----------------------------");//private olduğu için bu şekilde ulaşabilirim
        }

        customers.remove("Yaren");
            //customers.remove(1);
            // deseydim 1.index olan Zeynebin bilgilerini silerdi


        for (Customer customer:customers){
            System.out.println("#######################################");
            System.out.println("New customer list after remove:");
            //System.out.println(customer.FirstName()); //private olduğu için bu şekilde ulaşamam
            System.out.println("Customer ID: " + customer.getId() + "\nCustomer First Name: " + customer.getFirstName());
            System.out.println("----------------------------");//private olduğu için bu şekilde ulaşabilirim
        }


    }
}
