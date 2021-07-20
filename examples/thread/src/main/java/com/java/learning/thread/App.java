package com.java.learning.thread;

/**
 * Thread Example
 * Q1: How to block access to a thread? For instance, how to block access from main to mt?
 */
public class App 
{
    public static void main( String[] args )
    {
        MyThread mt = new MyThread();
        mt.run();
        // mt.start();
        Thread tmt = new Thread(mt);
        tmt.start();
        SecurityManager sm ;
        // Why does System has no Security Manager?
        // How is it used?
        if(System.getSecurityManager() != null){
            sm = System.getSecurityManager();
        }else{
            sm = new SecurityManager();
        }
        
        try{
            System.out.println("[Stage1] ------------------------------------------------------------------------");
            sm.checkAccess(mt);
            System.out.println("The main thread has access to mt thread");
        }catch(SecurityException se){
            se.printStackTrace();
        }catch(NullPointerException ne)     // If System does not have a Security Manager, NullPointerException is thrown
        {
            ne.printStackTrace();            
        }
        
        // Getting prio of current thread
        System.out.println("[Stage2] ------------------------------------------------------------------------");
        System.out.print("Prio of mt thread is:");
        System.out.println(mt.getPriority());

        // dumpStack() prints stacktrace to standard error stream. dumpStack() is a static method
        System.out.println("[Stage3] ------------------------------------------------------------------------");
        System.out.println("Now is stack being dumped:");
        Thread.dumpStack();

        // MAX_VALUE = 9223372036854775807 = 2^63
        Long longVar= Long.MAX_VALUE;

        // currentThread()
        System.out.println("[Stage4] ------------------------------------------------------------------------");
        System.out.print("Currently executing thread is: ");
        System.out.println(Thread.currentThread().getName());
        
    }
}
