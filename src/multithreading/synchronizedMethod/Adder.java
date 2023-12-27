package multithreading.synchronizedMethod;

public class Adder implements Runnable{
    private Counter c1;

    public Adder(Counter c1){
        this.c1 = c1;
    }

    @Override
    public void run() {
        increase(c1.count);
    }
    public synchronized void  increase(int c1) {
        for(int i=0; i< 10000; i++){
            c1 -= 1;
        }
    }
}
