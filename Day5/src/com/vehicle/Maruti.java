package com.vehicle;

public class Maruti extends Car{
    public Maruti(int id , String manufacturar,String model ,int speed){
        super(id,manufacturar,model,speed);
    }
    public void fByF(){
        System.out.println("4 * 4 mode activated");
        System.out.println("Off roading mode");
    }
}
