package OOPs.multithreading;

public class YieldMethodDemo extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(i + " current Thread: " + Thread.currentThread().getName());
            this.yield();
        }
    }
}
