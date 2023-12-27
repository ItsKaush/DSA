package designPattern.Adapter.ThirdParty;

public class ICICIBankAPI {
    //Mockup for third party API

    public double cehckBalanace(String accountNumber){
        return 1000;
    }

    public boolean sendMoney(String fromAcc, String toAcc, double money){
        return true;
    }

    public boolean addMoney(String accNum, double amount){
        return false;
    }
}
