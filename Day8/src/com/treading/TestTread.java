package com.treading;

public class TestTread {
    public static void main(String[] args) {
        Loop1 lp1 = new Loop1();
        Loop2 lp2 = new Loop2();
        Thread t1 = new Thread(lp2);
        lp1.setName("Tread1");
        lp1.start();
        t1.start();

    }
}