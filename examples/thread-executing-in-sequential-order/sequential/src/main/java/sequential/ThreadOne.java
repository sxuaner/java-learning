package sequential;

public class ThreadOne extends MyThread {

    MyThread t2 = new ThreadTwo();

    @Override
    public void run(){

        // Syncrhonize Mythread.output so that only 1 thread at a time can read/write data in that data structure.
        synchronized(MyThread.output){
            MyThread.output.add("T1 is running!");
            // To make sure the output list is printed after ThreadThree writes msg to it, use run() instead of start(). Because with run()
            // the thread executing code in ThreadOne gets reenterant lock and prevents any interleaved modification on output list.

            new Thread(t2).start();

            // new Thread(t2).run();

        }
 
    }
    

}
