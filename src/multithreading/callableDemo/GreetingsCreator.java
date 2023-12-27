package multithreading.callableDemo;

import java.util.Random;
import java.util.concurrent.Callable;

public class GreetingsCreator implements Callable<String> {
    Random r = new Random();
    @Override
    public String call() throws Exception {
        int num = Math.abs(r.nextInt()) % 5;
        if(num == 0){
            return "Hi";
        } else if (num == 1) {
            return "Hello";
        } else if (num == 2) {
            return "Namaste";
        } else if (num == 3) {
            return "Aadab";
        }else {
            return "Null";
        }
    }
}
