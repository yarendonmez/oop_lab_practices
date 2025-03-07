package com.yarendonmez.week1;

public class Employee {
    String name;
    String position;
    double salary;
    int yearsWorked;

    Employee(String name, String position, double salary, int yearsWorked){
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.yearsWorked = yearsWorked;
    }

    void showInfo(){
        System.out.println("Çalışan bilgileri:");
        System.out.println("Adı: "+name);
        System.out.println("Pozisyon: "+position);
        System.out.println("Maaş: "+salary);
        System.out.println("Çalışma süresi: "+yearsWorked+" yıl.");
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Zeynep","En iyi asistan",100000,5);
        employee1.showInfo();
    }
}
