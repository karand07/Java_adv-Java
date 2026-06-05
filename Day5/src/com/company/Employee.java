package com.company;

public class Employee {
    private int id ;
    private String name , designation ;
    private double salary;
    public Employee(){
        id = 1;
        name = "";
        designation = "";
        salary = 0;
    }
    public Employee(int id ,String name , String designation , double salary){
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
    public void getEmpoyee(){
        System.out.println("Employee id : " + id);
        System.out.println("Employee name:"+name);
        System.out.println("Employee designation:"+designation);
        System.out.println("Employee salary:"+salary);
    }
}
