package designPattern.Factory.Database;

public class Client {

    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        dataBase.connectDataBase();

        DataBaseFactory dataBaseFactory = dataBase.createDataBaseFactory(DataBaseTypes.MYSQL);


        Query query = dataBaseFactory.createQuery();
        query.makeQuery();

        Transaction transaction = dataBaseFactory.doTrancastion();
        transaction.transactio();
    }


}
