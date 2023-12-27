package designPattern.Factory.Database;

public class DataBaseFactoryFactory {
    public static DataBaseFactory createDataBaseFactory(DataBaseTypes types){
        if(types.equals(DataBaseTypes.ORACLE)){
            return new OracleDataBaseFactory();
        } else if (types.equals(DataBaseTypes.MYSQL)) {
            return new MySqlDataBaseFactory();
        }else {
            return null;
        }
    }
}
