package com.yarendonmez.finalPractice.InterfaceQ2;

public class LogManager {
    private  ILogger logger;

    public LogManager(ILogger logger){
        this.logger = logger;
    }

    public void logEvent(){
        logger.log("Loglama işlemi başarılı.");
    }



}
