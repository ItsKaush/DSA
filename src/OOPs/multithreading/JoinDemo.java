package OOPs.multithreading;

public class JoinDemo extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Child Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
