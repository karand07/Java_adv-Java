package com.banck;

public class Thread1 extends Thread  {
    private  Account act;
    public Thread1(Account act) {
        this.act = act;
    }
    @Override
    public void run() {
        System.out.println("thread1 started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        act.deposit(500);
        System.out.println("thread1 end with balance "+act.getBalance());
    }
}
