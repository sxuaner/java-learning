package com.java.learning.javase;

public class ThreadSE {
    public static void main(String[] args) {

        // interrupt(), interrupted(), isInterrupted() differences
        /**
         * 
            static int	activeCount()	
            Returns an estimate of the number of active threads in the current thread's thread group and its subgroups.
           
            void	checkAccess()	
            Determines if the currently running thread has permission to modify this thread.
           
            protected Object	clone()	
            Throws CloneNotSupportedException as a Thread can not be meaningfully cloned.
           
            int	countStackFrames()	
            Deprecated, for removal: This API element is subject to removal in a future version.
            The definition of this call depends on suspend(), which is deprecated.
           
            static Thread	currentThread()	
            Returns a reference to the currently executing thread object.
            static void	dumpStack()	
            Prints a stack trace of the current thread to the standard error stream.
            static int	enumerate​(Thread[] tarray)	
            Copies into the specified array every active thread in the current thread's thread group and its subgroups.
            static Map<Thread,​StackTraceElement[]>	getAllStackTraces()	
            Returns a map of stack traces for all live threads.
            ClassLoader	getContextClassLoader()	
            Returns the context ClassLoader for this thread.
            static Thread.UncaughtExceptionHandler	getDefaultUncaughtExceptionHandler()	
            Returns the default handler invoked when a thread abruptly terminates due to an uncaught exception.
            long	getId()	
            Returns the identifier of this Thread.
            String	getName()	
            Returns this thread's name.
            int	getPriority()	
            Returns this thread's priority.
            StackTraceElement[]	getStackTrace()	
            Returns an array of stack trace elements representing the stack dump of this thread.
            Thread.State	getState()	
            Returns the state of this thread.
            ThreadGroup	getThreadGroup()	
            Returns the thread group to which this thread belongs.
            Thread.UncaughtExceptionHandler	getUncaughtExceptionHandler()	
            Returns the handler invoked when this thread abruptly terminates due to an uncaught exception.
            static boolean	holdsLock​(Object obj)	
            Returns true if and only if the current thread holds the monitor lock on the specified object.
            void	interrupt()	
            Interrupts this thread.
            static boolean	interrupted()	
            Tests whether the current thread has been interrupted.
            boolean	isAlive()	
            Tests if this thread is alive.
            boolean	isDaemon()	
            Tests if this thread is a daemon thread.
            boolean	isInterrupted()	
            Tests whether this thread has been interrupted.
            void	join()	
            Waits for this thread to die.
            void	join​(long millis)	
            Waits at most millis milliseconds for this thread to die.
            void	join​(long millis, int nanos)	
            Waits at most millis milliseconds plus nanos nanoseconds for this thread to die.
            static void	onSpinWait()	
            Indicates that the caller is momentarily unable to progress, until the occurrence of one or more actions on the part of other activities.
            void	resume()	
            Deprecated.
            This method exists solely for use with suspend(), which has been deprecated because it is deadlock-prone.
            void	run()	
            If this thread was constructed using a separate Runnable run object, then that Runnable object's run method is called; otherwise, this method does nothing and returns.
            void	setContextClassLoader​(ClassLoader cl)	
            Sets the context ClassLoader for this Thread.
            void	setDaemon​(boolean on)	
            Marks this thread as either a daemon thread or a user thread.
            static void	setDefaultUncaughtExceptionHandler​(Thread.UncaughtExceptionHandler eh)	
            Set the default handler invoked when a thread abruptly terminates due to an uncaught exception, and no other handler has been defined for that thread.
            void	setName​(String name)	
            Changes the name of this thread to be equal to the argument name.
            void	setPriority​(int newPriority)	
            Changes the priority of this thread.
            void	setUncaughtExceptionHandler​(Thread.UncaughtExceptionHandler eh)	
            Set the handler invoked when this thread abruptly terminates due to an uncaught exception.
            static void	sleep​(long millis)	
            Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds, subject to the precision and accuracy of system timers and schedulers.
            static void	sleep​(long millis, int nanos)	
            Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds plus the specified number of nanoseconds, subject to the precision and accuracy of system timers and schedulers.
            void	start()	
            Causes this thread to begin execution; the Java Virtual Machine calls the run method of this thread.
            void	stop()	
            Deprecated.
            This method is inherently unsafe.
            void	suspend()	
            Deprecated.
            This method has been deprecated, as it is inherently deadlock-prone.
            String	toString()	
            Returns a string representation of this thread, including the thread's name, priority, and thread group.
            static void	yield()	
            A hint to the scheduler that the current thread is willing to yield its current use of a processor.
          * 
          */

            // wait() method is defined in Object
            /**
             * 
        #Signature of the Thread Class: 
            [java]
                public class Thread extends Object implements Runnable{}
            [end]    
        # Methods in thread class:
            [java]

                public final void setPriority(int priority){}
                public final void setDaemon(boolean on) {}          //A parameter of true denotes this Thread as a daemon thread.
            [end]
                
                ! The newly created object is a daemon thread if and only if the creating thread is a daemon
                !? what is daemon
                ! Components of some Linux desktop environments that are daemons include D-Bus, NetworkManager (here called unetwork), PulseAudio (usound), and Avahi. 
                ! In multitasking computer operating systems, a daemon (/ˈdiːmən/ or /ˈdeɪmən/) is a computer program that runs as a background process, rather than being under the direct control 
                ! of an interactive user. Traditionally, the process names of a daemon end with the letter d, for clarification that the process is in fact a daemon, and for differentiation between 
                ! a daemon and a normal computer program. For example, syslogd is a daemon that implements system logging facility, and sshd is a daemon that serves incoming SSH connections.

            [java]
                public final void join(long millisec) throws InterruptedException {} // The current thread invokes this method on a second thread, causing the current thread to block until the second thread terminates or the 
                                                                                        // specified number of milliseconds passes.
            [end]

            [java]
                public void start(){}
                public void run(){}
            [end]
                !? Different between start() and run() method
                The difference is that Thread.start() starts a new thread that calls the run() method, while Runnable.run() just calls the run() method on the calling thread.
                See in link: https://stackoverflow.com/questions/8579657/whats-the-difference-between-thread-start-and-runnable-run

                !? If run() method is executed on the same thread, why is the interface Runnable needed? What is the purpose of this interface.
                // Runnable is a functional interface, which has only 1 method to implement: public void run()
                This interface Runnable is designed to provide a common protocol for objects that #wish to execute code while they are active#. For example, Runnable is implemented by class Thread. 
                Being active simply means that a thread has been started and has not yet been stopped.
                If a class implements Runnable interface, the objects of this class should not execute any code when they are not active according to the above protocol.
                In addition, Runnable provides the means for a class to be active while not subclassing Thread. 
                A class that implements Runnable can run without subclassing Thread by instantiating a Thread instance and passing itself in as the target. 
                // ?? see howto in thread project
                [java]
                    class PrimeRun implements Runnable {
                        //...
                        }
                    // The following code would then create a new thread and start it running:
                    PrimeRun p = new PrimeRun(143);
                    new Thread(p).start();
                [end]
                
                // This means run() is executed on the thread itself
                In most cases, the Runnable interface should be used if you are only planning to override the run() method and no other Thread methods. 
                // This means if the program does not need multiple threads, the class should implement Runnable instead of subclassing the thread class. Reason why subclassing is not  recommended are 
                // as follows
                This is important because classes should not be subclassed unless the programmer intends on modifying or enhancing the fundamental behavior of the class.
            [java]
            public void checkAccess()     // What is Security Manager???
            [end]

            [java]
            protected Object clone()  //Throws CloneNotSupportedException as a Thread can not be meaningfully cloned.
            [end]

            [java]
            public static Thread currentThread()     //Returns a reference to the currently executing thread object.
            [end]
            Example:

            [java]
            public static void dumpStack()  // Prints a stack trace of the current thread to the standard error stream. Example in thread project
            [end]

            [java]
            public final void join() throws InterruptedException
            [end]
            Thread class provides the join() method which allows one thread to wait until another thread completes its execution. If t is a Thread object whose thread is currently executing, then t. 
            join() will make sure that t is terminated before the next instruction is executed by the program.

            The join method allows one thread to wait for the completion of another. If t is a Thread object whose thread is currently executing,
            causes the current thread to pause execution until t's thread terminates. Overloads of join allow the programmer to specify a waiting period. However, as with sleep, 
            join is dependent on the OS for timing, so you should not assume that join will wait exactly as long as you specify.
            Like sleep, join responds to an interrupt by exiting with an InterruptedException.

        join()
        Solutions using Join() do not answer the question - they ensure that the termination of the threads is ordered, not the running of them. 
        If the interviewr does not get that, you need to find another job anyway.
*/

         // how to interrupt
        
    }
    
}
