package multithreading.atomicDataTypesDemo;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        counter.count.set(10);



        Subtracter subtracter = new Subtracter(counter);
        Thread thread1 = new Thread(subtracter);
        thread1.start();

        Adder adder = new Adder(counter);
        Thread thread = new Thread(adder);
        thread.start();


        thread.join();
        thread1.join();
        System.out.println(counter.count.get());


    }
}
