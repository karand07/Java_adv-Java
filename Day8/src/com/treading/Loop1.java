package com.treading;

public class Loop1 extends Thread {
    @Override
    public void run(){
        for (int i = 1; i < 11; i++) {
        if(i%2!=0){
            System.out.println("odd :"+i);
            try {
                Thread.sleep(1010);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        }
    }
}
