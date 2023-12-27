package designPattern.singleton;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        DBConnection dbConnection = DBConnection.getInstance("url","4420","root", "123");
        System.out.println(dbConnection);

        DbConnThread1 thread1 = new DbConnThread1();
        Thread t = new Thread(thread1);
        t.start();

        t.join();


    }
}
