package com.java.learning.javase.interview;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicInteger;

/**
    A thread state. A thread can be in one of the following states:
    NEW
    A thread that has not yet started is in this state.
    RUNNABLE
    A thread executing in the Java virtual machine is in this state.
    BLOCKED
    A thread that is blocked waiting for a monitor lock is in this state.
    WAITING
    A thread that is waiting indefinitely for another thread to perform a particular action is in this state.
    TIMED_WAITING
    A thread that is waiting for another thread to perform an action for up to a specified waiting time is in this state.
    TERMINATED
    A thread that has exited is in this state.

    A thread can be in only one state at a given point in time. These states are virtual machine states which do not reflect any operating system thread states.
 */

/**
 * Question: how to synchronize 10 threads until they are in the same state. How
 * many states are possible? 1. Runnable? 2. wait 3.
 * 
 */
public class SynchronizeTenThreads {

    private class Task implements Runnable {

        AtomicInteger ai = new AtomicInteger(1);

        @Override
        public void run() {
            try {
                while (ai.getAndIncrement() <= 10) {
                    // the static method sleep() should be accessed in a static way
                    Thread.sleep(10000);
                    System.out.println("t's current state: "+ Thread.currentThread().getState().toString());
                    System.out.println("t threas execuion completes");
                }
            }
            // Either re-interrupt this method or rethrow the "InterruptedException" that
            // can be caught here.
            catch (InterruptedException e) {
                // t.interrupt() in main method interrupts the sleep of t. The reason why t
                // continues executing is the why loop
                System.out.println("t is interrupted and will it continue executing?");
            }
        }
    }

    public static void main(String[] args) {

        Thread t = new Thread();

        // Current state is NEW, because the thread has not been started
        System.out.println(t.getState().toString());

        // start the thread and check for state again. However at this point the thread
        // is not doing anything
        t.start();

        /// Now to pass the Runnable to the thread, a new one must be created

        /**
         * How to instantiate an inner class No enclosing instance of type
         * SynchronizeTenThreads is accessible. Must qualify the allocation with an
         * enclosing instance of type SynchronizeTenThreads (e.g. x.new A() where x is
         * an instance of SynchronizeTenThreads)
         * 
         * error report: new Task()
         */

        t = new Thread(new SynchronizeTenThreads().new Task());
        t.start();

        // add some sleep time for main, so to make sure t has started
        try {
            Thread.sleep(1000);
            // now let's check t's state from main thread
            System.out.println("Checking t's state from main: " + t.getState());
            Thread.sleep(1000);

            // Interrupts this thread.
            // what thread does "this" refer to?
            // meaning t?
            t.interrupt();

            AtomicInteger ai = new AtomicInteger(1);
            while (ai.getAndIncrement() <= 10) {
                Thread.sleep(1000);
            } // The main thread terminates here and it cannot be seen in the call stack.

        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("Main thread execution completes");
    }

}
