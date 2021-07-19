package sequential;


public class ThreadThree extends MyThread{
    @Override
    public void run() {
        synchronized(MyThread.output){
            MyThread.output.add("T3 is running!");
        }
    }
}
