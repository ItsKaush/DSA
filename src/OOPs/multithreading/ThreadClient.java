package OOPs.multithreading;

public class ThreadClient {
    public static void main(String[] args) throws InterruptedException {
//        YieldMethodDemo yieldMethodDemo = new YieldMethodDemo();
//        yieldMethodDemo.start();
//
//        YieldMethodDemo yieldMethodDemo1 = new YieldMethodDemo();
//        yieldMethodDemo1.start();
//
//        Thread.yield();
        JoinDemo joinDemo = new JoinDemo();
        joinDemo.start();
        joinDemo.join();
        for(int i=0; i<5; i++){
            System.out.println("Main thread: " + i);
        }

    }
}
