package designPattern.singleton;

public class DbConnThread1 implements Runnable{
    @Override
    public void run() {
        DBConnection dbConnection = DBConnection.getInstance("name","3245","user2","test");
        System.out.println(dbConnection);
    }
}
