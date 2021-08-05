package sequential;

public class StarterThread extends Thread{
    private Runnable runIt;

    public void setThread(Runnable t){
        this.runIt = t;
    }
}
