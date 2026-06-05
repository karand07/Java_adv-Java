package com.vehicle;

public class SportsCar extends Car{
    public SportsCar(int id,String manufacturer,String model,int speed){
    super(id,manufacturer,model,speed);
    }
    @Override
    public void speed (){
        System.out.println("Speed:300km/hr");
    }
    public void fwd(){
        System.out.println("Front wheel drive activated.");
    }
}
