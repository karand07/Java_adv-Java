package com.vehicle;

public class Main {
    public static void main(String[] args) {
        Bmw bmw = new Bmw(1,"M5",400);
        bmw.speed();
        System.out.println(bmw.tooString());
    }
}
