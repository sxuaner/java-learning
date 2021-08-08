package com.java.learning.javase;

public class ThreadSE {
    public static void main(String[] args) {

        /**
         * What t1.join() does is, t.join() waits until thread t is dead. (I.e., you call it,
         * and it doesn't return until t is dead).
         * 
         * How it works is, it sits in a loop, testing the status of the thread and
         * calling t.wait() if the thread is not dead yet. One of the last things the
         * thread does as it dies is to change its state and then call t.notifyAll().
         */


        
    }
    
}
