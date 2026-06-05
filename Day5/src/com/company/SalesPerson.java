package com.company;

public class SalesPerson extends Employee {
    public SalesPerson(int id, String name , String designation , double salary){
        super(id,name,designation,salary);
        System.out.println("SalesPerson");
    }
    public void clientEnquiry(){
        System.out.println("client Enquiry about company");
    }
    public  void getSP(){
        super.getEmpoyee();
        System.out.println("getSP");
    }
}
