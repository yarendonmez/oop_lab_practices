package com.yarendonmez.finalPractice.ExceptionHandling.CustomExceptionDemo;

public class BalanceInsaficitionException extends Exception{
  private String message;
  public BalanceInsaficitionException(String message){
      this.message = message;
  }

  public String getMessage(){
      return this.message;
  }

  public void setMessage(String message){
      this.message=message;
  }

}
