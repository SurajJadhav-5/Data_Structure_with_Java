package com.suraj.exceptionHandling;

// own exception creation
public class MyException extends Exception{
    MyException(String name){
        super(name);
    }
}
