package com.company;

public class Employee {
    private int id ;
    private String name ,designation,email;
    private double salary;

    public Employee(int id, String name, String designation, String email, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.email = email;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDesignation(){
        return designation;
    }
    public void setDesignation(String designation){
        this.designation = designation;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public double getSalary(){
        return salary;
    }
    public String tooString(){
        return "name :"+name+" email:"+email + " designation"+designation;
    }
}
