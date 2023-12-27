package designPattern.Factory.Database;

public class MySqlQuery implements Query{
    @Override
    public void makeQuery() {
        System.out.println("Making My SQL Query");
    }
}
