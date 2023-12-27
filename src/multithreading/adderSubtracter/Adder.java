package multithreading.adderSubtracter;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    private Counter c1;
   Lock lock;
    public Adder(Counter c1, Lock lock){
        this.c1 = c1;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i=1; i<10000; i++) {
            lock.lock();
            c1.count++;
            lock.unlock();
        }
    }
}
