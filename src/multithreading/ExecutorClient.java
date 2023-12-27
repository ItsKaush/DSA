package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorClient {
    public static void main(String[] args) {
        System.out.println("Inside main Thread start");
        ExecutorService es = Executors.newFixedThreadPool(10);


        for (int i=0; i<100; i++){
            NumberPrinter numberPrinter = new NumberPrinter();
            numberPrinter.setNumToPrint(i);
            es.submit(numberPrinter);
        }

        System.out.println("Inside main thread End");
        es.shutdown();
    }
}
