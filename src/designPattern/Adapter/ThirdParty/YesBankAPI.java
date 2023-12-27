package designPattern.Adapter.ThirdParty;

public class YesBankAPI {
    //Mockup for third party API

    public double checkBalance(String accountNumber){
        return 1000.0;
    }

    public boolean sendMoney(String fromAcc, String toAcc, double money){
        return true;
    }

    public boolean addMoney(String accNum, double amount){
        return false;
    }
}
