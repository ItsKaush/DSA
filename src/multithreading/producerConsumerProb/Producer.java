package multithreading.producerConsumerProb;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private String name;
    private Semaphore ps;
    private Semaphore cs;
    private Queue<Object> stores;

    public Producer(String name, Semaphore ps, Semaphore cs, Queue<Object> stores) {
        this.name = name;
        this.ps = ps;
        this.cs = cs;
        this.stores = stores;
    }

    @Override
    public void run() {
        try {
            ps.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stores.add(new Store());
        System.out.println(name + " Added a shirt, Store size now : " + stores.size());
        cs.release();
    }
}
