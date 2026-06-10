package com.treading;

public class TreadLifeCycle {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main tread");
        Loop2 obj = new Loop2();
        Thread t1 = new Thread(obj); //thread born

        t1.start(); // thread started

        t1.join(1000); // main  thread will wait until t1 get dead
        System.out.println("T1 is Live ?:"+t1.isAlive());
        System.out.println("main end");
    }
}
