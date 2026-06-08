package com.vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car obj = new Bmw();

        if()
















        Scanner sc = new Scanner(System.in);
        Car []car = new Car[3];
        int ch;
        int index = 0;
        do {
            System.out.println("Choose Option:");
            System.out.println("1: maruti ");
            System.out.println("2: Bmw");
            System.out.println("3: Farrari");
            System.out.println("4: See participants information");
            System.out.println("5: Exit");
            ch  = sc.nextInt();
            switch (ch) {
                case 1->{
                    if (index<car.length){
                        Maruti m = new Maruti(1,"maruti","alto",120);
                        car[index] = m;
                        index++;
                        System.out.println("Maruti Alto Added");
                    }
                    else {
                        System.out.println("--------fulll---------");
                    }
                }
                case 2->{
                    if (index<car.length){
                        Bmw bmw = new Bmw(2,"M5",350);
                        car[index] = bmw;
                        index++;
                        System.out.println("Bmw m5 Added");
                    }
                    else {
                        System.out.println("--------fulll----------");
                    }
                }case 3->{
                    if (index<car.length){
                        Fararri f = new Fararri(3,"Spider",410);
                        car[index] = f;
                        index++;
                        System.out.println("Fararri Added");
                    }else  {
                        System.out.println("--------fulll----------");
                    }
                }
                case 4->{
                    System.out.println("Participants info");
                    for (Car value : car) {
                        System.out.println(value.tooString());
                    }
                }
                case 5->{
                    System.out.println("------------Thanks for Racing-----------");
                }
                default -> System.out.println("Invalid Input");
            }

        }while (ch!=5);
    }
}
