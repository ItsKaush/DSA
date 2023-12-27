package designPattern.Factory.Database;

public interface DataBaseFactory {
    //Factory Methods
    Query createQuery();

    Transaction doTrancastion();

}
