package com.yarendonmez.finalPractice.ExceptionHandling.ThrowExample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UncheckException {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\YAREN\\IdeaProjects\\oop_lab_practices\\src\\main\\java\\com\\yarendonmez\\finalPractice\\ExceptionHandling\\ThrowExample\\sayilar.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try{
                reader.close();
            }catch (IOException ioException){

            }

        }

    }




}
