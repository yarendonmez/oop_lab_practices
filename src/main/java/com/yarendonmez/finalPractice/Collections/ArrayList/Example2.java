package com.yarendonmez.finalPractice.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class Example2 {
    public static void main(String[] args) {
        ArrayList test = new ArrayList();
        test.add("Gofret");
        test.add("yaş mama");
        test.add("oyun");

        for (Object item: test){ //for each döngüsü
            System.out.println(item);
        }




    }
}
