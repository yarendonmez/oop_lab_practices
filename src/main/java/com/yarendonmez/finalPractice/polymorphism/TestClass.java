package com.yarendonmez.finalPractice.polymorphism;

public class TestClass {
    public static void main(String[] args) {
        BaseLogger[] loggers = new BaseLogger[] {
                new EmailLogger(),
                new DataBaseLoger(),
                new FileLogger(),
                new ConsolLogger()};
        for (BaseLogger logger:loggers){
            logger.log("Log mesajı");

        }
    }
}
