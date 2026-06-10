package com.banck;

public class MasterThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread start");
        Account act = new Account(111,"sai");
        Thread1 bEmp1 = new Thread1(act);
        Thread2 bEmp2 = new Thread2(act);
        bEmp1.setName("bEmp1 : for deposite");
        bEmp2.setName("bEmp2 : for deposite");
        bEmp1.start();
        bEmp2.start();
        bEmp1.join();
        bEmp2.join();

        System.out.println("main thread end");
    }
}
