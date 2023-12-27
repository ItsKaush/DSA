package multithreading;

public class ThreadClient {
    public static void main(String[] args) {

        System.out.println("Hi from the main Thread");
        NumberPrinter numberPrinter = new NumberPrinter();
        for(int i=0; i<5; i++){
            numberPrinter.setNumToPrint(i);
            Thread t = new Thread(numberPrinter);
            t. start();
        }
        System.out.println("Bye from the main Thread");

    }
}
