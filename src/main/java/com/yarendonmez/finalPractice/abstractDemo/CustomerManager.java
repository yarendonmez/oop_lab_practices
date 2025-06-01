package com.yarendonmez.finalPractice.abstractDemo;

public class CustomerManager {
    BaseDatabaseManager dataBaseManager;

    public void getCustomer(){
        dataBaseManager.getData();
    }

}

/*
1. BaseDatabaseManager databaseManager;
Bu, CustomerManager sınıfının bir özelliği (field'ı).

Tipi: BaseDatabaseManager (bu bir abstract sınıf ya da superclass olabilir).

Ancak şu an bu databaseManager değişkenine bir değer atanmamış.

2. getCustomer() Metodu:
Bu metot çağrıldığında, databaseManager nesnesinin getData() metodunu çağırıyor.

Yani dışarıdan bu databaseManager’ın bir örneği atanmalı, yoksa NullPointerException alınır.


 */