package multithreading.synchronizedDemo;

public class Adder implements Runnable{
    private Counter c1;

    public Adder(Counter c1){
        this.c1 = c1;
    }

    @Override
    public void run() {
        for(int i=1; i<10000; i++) {
            synchronized (c1){
                c1.count++;
            }
        }
    }
}
