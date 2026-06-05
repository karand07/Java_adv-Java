package com.vehicle;

public class Fararri extends SportsCar{
    public Fararri(int id,String model,int speed){
        super(id,"Farrari",model,speed);
    }
    @Override
    public void speed() {
        System.out.println("Speed:400km/hr");
    }
    public void nos(){
        System.out.println("Nos Activated");
    }
    public void roof(){
        System.out.println("Open roof");
    }
}
