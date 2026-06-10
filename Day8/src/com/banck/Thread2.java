package com.banck;

public class Thread2 extends Thread{
    private Account act;
    public Thread2(Account act){
        this.act = act;
    }
    public void run(){
        System.out.println("thread2 started");
        try {
            Thread.sleep(1010);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        act.withdraw(200);
        System.out.println("thread2 end with balance "+act.getBalance());
    }
}
