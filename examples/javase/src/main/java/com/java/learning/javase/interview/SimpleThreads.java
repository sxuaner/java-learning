package com.java.learning.javase.interview;

public class SimpleThreads extends Object {
    // Display a message, preceded by the name of the current thread
    static void threadMessage(String message) {
        String threadName =
            Thread.currentThread().getName();
        System.out.format("%s: %s%n",
                          threadName,
                          message);
    }

    private static class MessageLoop implements Runnable {
        public void run() {
            String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
            };
            try {
                for(String i : importantInfo){
                    // Pause for 4 seconds
                    Thread.sleep(4000);
                    // Print a message
                    threadMessage(i);
                }
            } catch (InterruptedException e) {
                threadMessage("I wasn't done!");
            }
        }
    }

    public static void main(String args[]) throws InterruptedException {
        // Delay, in milliseconds before we interrupt MessageLoop thread (default one hour).
        long patience = 1000 * 60 * 60;

        // If command line argument present, gives patience in seconds.
        if (args.length > 0) {
            try {
                // Parses the string argument as a signed decimal long
                patience = Long.parseLong(args[0]) * 1000;
            } catch (NumberFormatException e) {
                System.err.println("Argument must be an integer.");
                System.exit(1);
            }
        }

        threadMessage("Starting MessageLoop thread");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new MessageLoop());
        t.start();

        threadMessage("Waiting for MessageLoop thread to finish");
        // loop until MessageLoop thread exits
        while (t.isAlive()) {
            threadMessage("Still waiting...");
            // Wait maximum of 1 second for MessageLoop thread(which is the t thread) to finish.
            t.join(1000);
            // pay attention to this guard!
            if (((System.currentTimeMillis() - startTime) > patience) && t.isAlive()) 
                {
                    threadMessage("Tired of waiting!");
                    t.interrupt();
                    // Shouldn't be long now
                    // -- wait indefinitely
                    t.join();
                }
        }
        threadMessage("Finally!");

    }
}