package designPattern.Factory.Database;

public class OracleQuery implements Query{
    @Override
    public void makeQuery() {
        System.out.println("Making Oracle Query");
    }
}
