package com.vehicle;

public class Car {
    private int id ;
    private String manufacturer;
    private String model;
    private int speed;

    public Car(){
        System.out.println("Basic Car");
        id = 1;
        manufacturer = "maruti";
        model = "alto";
        speed = 60;
    }
    public void speed (){
        System.out.println("Speed:60km/hr");
    }
    public Car(int id,String manufacturer,String model,int speed){
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.speed = speed;
    }
    public String tooString(){
        return    manufacturer +" " + model + " has " + speed +"km/hr";
    }
}
