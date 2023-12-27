package multithreading.adderSubtracter;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        counter.count=10;

        Lock lock = new ReentrantLock();

        Subtracter subtracter = new Subtracter(counter, lock);
        Thread thread1 = new Thread(subtracter);
        thread1.start();

        Adder adder = new Adder(counter, lock);
        Thread thread = new Thread(adder);
        thread.start();


        thread.join();
        thread1.join();
        System.out.println(counter.count);
    }
}
