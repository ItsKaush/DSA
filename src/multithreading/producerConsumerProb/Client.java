package multithreading.producerConsumerProb;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Queue<Object> stores = new LinkedList<>();
        int cap = 5;
        Semaphore ps = new Semaphore(5);
        Semaphore cs = new Semaphore(0);

        for(int i=0; i<10000; i++){
            Producer producer = new Producer("p"+i, ps, cs, stores);
            Thread thread = new Thread(producer);
            thread.start();

            Consumer consumer = new Consumer("c"+i, ps, cs, stores);
            Thread thread1 = new Thread(consumer);
            thread1.start();
        }
    }
}
