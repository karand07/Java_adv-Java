package com.vehicle;

public class Bmw extends  SportsCar{
    public  Bmw(){
        super();
    }
    public Bmw(int id,String model,int speed){
        super(id,"Bmw",model,speed);
    }
    public void dragMode(){
        System.out.println("drag mode ACTIVATED");
    }

}
