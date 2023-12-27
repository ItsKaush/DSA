package multithreading.synchronizedMethod;

public class Subtracter implements Runnable{
    private Counter c1;


    public Subtracter(Counter c1){
        this.c1 = c1;
    }

    @Override
    public void run() {
        decrease(c1.count);
    }

    public synchronized void  decrease(int c1) {
        for(int i=0; i< 10000; i++){
            c1 -= 1;
        }

    }
}
