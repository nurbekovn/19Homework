package com.company;

public class Car implements AutoCloseable {

    public  void drive(){
        System.out.println(" Car is driving");
    }
    
    @Override
    public void close() throws Exception {
        System.out.println(" Car is closing ");
    }
}
