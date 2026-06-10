package com.treading;

public class Loop2 implements Runnable{
    public void run(){
        for (int i = 1; i<11 ; i++) {
            if(i%2==0){
                System.out.println("even :"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
