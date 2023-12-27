package designPattern.Factory.Database;

public class MySqlDataBaseFactory implements DataBaseFactory{
    @Override
    public Query createQuery() {
        return new MySqlQuery();
    }

    @Override
    public Transaction doTrancastion() {
        return new MySqlTransaction();
    }
}
