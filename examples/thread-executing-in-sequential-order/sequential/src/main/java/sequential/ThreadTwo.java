package sequential;

public class ThreadTwo extends MyThread {
   
    // MyThread t3 = new ThreadThree();

    @Override
    public void run() {
        
        // Reentrant Synchronization, since 
        synchronized(MyThread.output){
            MyThread.output.add("T2 is running!");

            // new Thread(t3).run();
            // new Thread(t3).start();
            // new Thread(t3).run();

        }

    }

    
}
