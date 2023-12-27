package designPattern.Factory.Database;

public class MySqlTransaction implements Transaction{
    @Override
    public void transactio() {
        System.out.println("My Sql Transaction");
    }
}
