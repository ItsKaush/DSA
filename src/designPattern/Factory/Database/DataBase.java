package designPattern.Factory.Database;

public class DataBase {
    //Non Factory method
    public void connectDataBase(){
        System.out.println("Connecting to DB");
    }

    public void disconnectDataBase(){
        System.out.println("Disconnecting from DB");
    }

    public DataBaseFactory createDataBaseFactory(DataBaseTypes types){
        return DataBaseFactoryFactory.createDataBaseFactory(types);
    }
}
