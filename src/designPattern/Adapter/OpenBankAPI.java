package designPattern.Adapter;

public interface OpenBankAPI {
    double checkBalance (String accountNumber);
    boolean sendMoney(String fromAccount,String toAccount, double money);
    boolean addMoney(String accountNumber, double money);
}
