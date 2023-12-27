package designPattern.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DBConnection {
    private String url;
    private String port;
    private String userName;
    private String password;
    private static Lock lock = new ReentrantLock();

    private static DBConnection instance;

    private DBConnection(String url, String port, String userName, String password) {
        this.url = url;
        this.port = port;
        this.userName = userName;
        this.password = password;
    }

    public static  DBConnection getInstance(String url, String port, String userName, String password){
        if(instance == null){ // stop meaningless wait of the threads coming after the instance is created
            lock.lock();
            if(instance == null){//stop multiple threads to create multiple instance
                instance = new DBConnection(url,port,userName,password);
            }
            lock.unlock();
        }
        return instance;
    }
}
