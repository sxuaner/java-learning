package com.java.learning.javase;

public class ThreadSE {
    public static void main(String[] args) {
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


         
        
    }
    
}
