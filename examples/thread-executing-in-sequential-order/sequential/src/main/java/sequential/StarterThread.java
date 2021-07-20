package sequential;

public class StarterThread extends Thread{

    
    public void setThread(Runnable t){
        this.runIt = t;
    }
}
