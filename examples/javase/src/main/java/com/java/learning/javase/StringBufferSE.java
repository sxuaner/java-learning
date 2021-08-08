package com.java.learning.javase;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * public final class StringBuffer extends Object 
 *      implements Serializable, Comparable<StringBuffer>, CharSequence
 * 
 * String is immmutable;
 * StringBuffer is mutable and thread-safe;
 * StringBuilder is mutable and non-thread-safe and best suited for single thread as drop-in replacement for StringBuffer
 * 
 * A thread-safe, mutable sequence of characters. A string buffer is like a
 * String, but can be modified. At any point in time it contains some particular
 * sequence of characters, but the length and content of the sequence can be
 * changed through certain method calls. 
 * 
 * String buffers are safe for use by multiple threads. The methods are synchronized where necessary so that all
 * the operations on any particular instance behave as if they occur in some
 * serial order that is consistent with the order of the method calls made by
 * each of the individual threads involved.
 * 
 * The principal operations on a StringBuffer are the append and insert methods,
 * which are overloaded so as to accept data of any type. Each effectively
 * converts a given datum to a string and then appends or inserts the characters
 * of that string to the string buffer. The append method always adds these
 * characters at the end of the buffer; the insert method adds the characters at
 * a specified point.
 * 
 * Whenever an operation occurs involving a source sequence (such as appending
 * or inserting from a source sequence), this class synchronizes only on the
 * string buffer performing the operation, not on the source. 
 *  
 * ?? Try this
 * Note that while StringBuffer is designed to be safe to use concurrently from multiple
 * threads, if the constructor or the append or insert operation is passed a
 * source sequence that is shared across threads, the calling code must ensure
 * that the operation has a consistent and unchanging view of the source
 * sequence for the duration of the operation. This could be satisfied by the
 * caller holding a lock during the operation's call, by using an immutable
 * source sequence, or by not sharing the source sequence across threads.
 * 
 * Every string buffer has a capacity. As long as the length of the character
 * sequence contained in the string buffer does not exceed the capacity, it is
 * not necessary to allocate a new internal buffer array. If the internal buffer
 * overflows, it is automatically made larger.
 * 
 * Unless otherwise noted, passing a null argument to a constructor or method in
 * this class will cause a NullPointerException to be thrown.
 * 
 * As of release JDK 5, this class has been supplemented with an equivalent
 * class designed for use by a single thread, StringBuilder. The StringBuilder
 * class should generally be used in preference to this one, as it supports all
 * of the same operations but it is faster, as it performs no synchronization.
 * 
 * ???? Investigate
 * API Note: StringBuffer implements Comparable but does not override equals.
 * Thus, the natural ordering of StringBuffer is inconsistent with equals. Care
 * should be exercised if StringBuffer objects are used as keys in a SortedMap
 * or elements in a SortedSet. See Comparable, SortedMap, or SortedSet for more
 * information.
 * 
 */
public class StringBufferSE {
    // What does it mean by "StringBuffer is thread-safe?"? What methods are thread-safe?

    public static void main(String[] args) {
        // what is toStringCache? count in StringBuffer?
        StringBuffer strBuffer = new StringBuffer();
        AtomicInteger count = new AtomicInteger(0);

        long performanceCalc = System.currentTimeMillis();
         class TestThread extends Thread{
            @Override
            public void run() {
                // How is 1 second represented in Java? By using Thread.sleep(millisec). 
                // Watchout: sleep() is a static method
                while(count.get()<10){
                    try {
                        // expected: 0:t0#1:t1#...#9:t?
                        // Before sleep in try block in main method: "#0:Thread-0#1:Thread-1#2:Thread-0#3:Thread-1#4:Thread-0#4:Thread-1#6:Thread-0#6:Thread-1#8:Thread-0#8:Thread-1"
                        // After: "#0:Thread-0#1:Thread-1#2:Thread-0#3:Thread-1#4:Thread-0#5:Thread-1#6:Thread-0#7:Thread-1#8:Thread-0#9:Thread-1"
                        strBuffer.append("#"+ count + ":"+this.getName());
                        count.incrementAndGet();
                        // sleeping too long causes the program to exit? 
                        // When there no response from the thread, it means the thread is in sleep
                        // click on call stack to operate on the threads
                        Thread.sleep(10000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }//end

        try {
            TestThread t1 = new TestThread();
            t1.start();
            // Put sleep here so that the 2 threads are not competing at the same time.
            Thread.sleep(5000);
            TestThread t2 = new TestThread();
            t2.start();

            /**
             * What t1.join() does is, t.join() waits until thread t is dead. (I.e., you call it,
             * and it doesn't return until t is dead).
             * 
             * How it works is, it sits in a loop, testing the status of the thread and
             * calling t.wait() if the thread is not dead yet. One of the last things the
             * thread does as it dies is to change its state and then call t.notifyAll().
             */
            t1.join(); 

            t2.join();

            //How to trigger InterrupedException

        } catch (Exception e) {         // set the break point here
            e.printStackTrace();
        }
        
        performanceCalc = System.currentTimeMillis() - performanceCalc;
        //How to run code after all threads are dead?
        // 55025 mils = 55s
        System.out.println(performanceCalc);        

        //yield()
        /**
         * A hint to the scheduler that the current thread is willing to yield its current
         * use of a processor. The scheduler is free to ignore this hint. Yield is a
         * heuristic attempt to improve relative progression between threads that would
         * otherwise over-utilise a CPU. Its use should be combined with detailed
         * profiling and benchmarking to ensure that it actually has the desired effect.
         * 
         * It is rarely appropriate to use this method. It may be useful for debugging
         * or testing purposes, where it may help to reproduce bugs due to race
         * conditions. It may also be useful when designing concurrency control
         * constructs such as the ones in the java.util.concurrent.locks package.
         * 
         * 
         * to stop in order to allow other vehicles to go past, especially before you
         * drive onto a bigger road:
         * 
         * to bend or break under pressure:
         * 
         * to give up the control of or responsibility for something, often because you
         * have been forced to:
         */
    }
    
}
