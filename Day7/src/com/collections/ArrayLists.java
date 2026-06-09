package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int opt;
        do{
            System.out.println("select opt:");
            opt = sc.nextInt();

            switch (opt){
                case 1 ->{
                    System.out.println("add new num");
                    int num = sc.nextInt();
                    list.add(num);
                }
                case 2 ->{
                    System.out.println("remove num");
                    int num = sc.nextInt();
                    list.remove(num);
                }
                case 3 ->{
                    System.out.println("search num");
                    int num = sc.nextInt();
                    System.out.println(list.contains(num));
                }
                case 4 ->{
                    System.out.println("print list");
                    for(int i : list){
                        System.out.println(i);
                    }
                }
                case 5 ->{
                    System.out.println("sort list");
                    Collections.sort(list);
                }
            }

        }while(opt !=4);
    }
}
