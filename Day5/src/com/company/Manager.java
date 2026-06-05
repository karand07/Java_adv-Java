package com.company;

public class Manager extends Employee{
    public Manager(){
        super();
        System.out.println("Default manager");
    }
    public Manager(int id,String name,String designation,double salary){
        super(id,name,designation,salary);
        System.out.println("Manager");
    }
}
