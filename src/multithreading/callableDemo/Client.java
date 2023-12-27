package multithreading.callableDemo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        GreetingsCreator greetingsCreator = new GreetingsCreator();
        Future<String> greeting = executorService.submit(greetingsCreator);
        System.out.println(greeting.get()); // get can become the potentially blocking thread, it will wait for the child thread to execute first then only move to later.
        System.out.println("Inside Client");
        System.out.println("Inside the Client End");
        executorService.shutdown();
    }
}
