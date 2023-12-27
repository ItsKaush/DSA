package multithreading;


public class NumberPrinter implements Runnable{
    private int numToPrint;
    @Override
    public void  run() {
        System.out.println(numToPrint+ " This number is printed by " + Thread.currentThread().getName());
    }

//    public NumberPrinter(int numToPrint) {
//        this.numToPrint = numToPrint;
//    }

    public void setNumToPrint(int numToPrint) {
        this.numToPrint = numToPrint;
    }
}
