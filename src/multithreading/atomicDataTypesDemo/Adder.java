package multithreading.atomicDataTypesDemo;

public class Adder implements Runnable{
    private Counter c1;

    public Adder(Counter c1){
        this.c1 = c1;
    }

    @Override
    public void run() {
        for(int i=1; i<10000; i++) {
            c1.count.addAndGet(1);
        }
    }
}
