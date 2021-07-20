package com.java.learning.thread;

public class MyThread implements Runnable{

    @Override
    public synchronized void run() {
        System.out.println("One Object of MyThread is running");
        System.out.println("[Run] ------------------------------------------------");
        System.out.print("Currently executing thread is: ");
        System.out.println(Thread.currentThread().getName());
        System.out.println("[Run] ------------------------------------------------");

        // Add sleep to avoid race condition with main thread
        try{
           this.wait(1000);
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }  



    
}
