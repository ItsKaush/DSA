package designPattern.Factory.Database;

public class OracleTransaction implements Transaction{
    @Override
    public void transactio() {
        System.out.println("Oracle Transaction");
    }
}
