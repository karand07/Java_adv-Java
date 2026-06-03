package com.employee;

public class Employee {
    private int emp_id;
    private String name, email;
    private double salry;

    public void createEmp(int id,String name ,String email, double sal){
        emp_id = id;
        this.name = name;
        this.email = email;
        salry= sal;
    }

    public void getEmp(){
        System.out.println("Employee ID: "+emp_id);
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Salary: "+salry);
    }
}
