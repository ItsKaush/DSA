package designPattern.Factory.Database;

public class OracleDataBaseFactory implements DataBaseFactory{
    @Override
    public Query createQuery() {
        return new OracleQuery();
    }

    @Override
    public Transaction doTrancastion() {
        return new OracleTransaction();
    }
}
