package multithreading.producerConsumerProb;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private String name;
    private Semaphore ps;
    private Semaphore cs;
    private Queue<Object> stores;

    public Consumer(String name, Semaphore ps, Semaphore cs, Queue<Object> stores) {
        this.name = name;
        this.ps = ps;
        this.cs = cs;
        this.stores = stores;
    }
    @Override
    public void run() {
        try {
            cs.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stores.poll();
        System.out.println(name + " Removed a shirt, Store size now : " + stores.size() );
        ps.release();
    }
}
