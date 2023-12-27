package designPattern.Adapter;

import designPattern.Adapter.ThirdParty.YesBankAPI;

public class YesBankAPIAdapter implements OpenBankAPI{

    //will create an object of third party and call their api accordingly

    YesBankAPI yesBankAPI = new YesBankAPI();
    @Override
    public double checkBalance(String accountNumber) {
        return yesBankAPI.checkBalance(accountNumber);
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double money) {
        return yesBankAPI.sendMoney(fromAccount,toAccount,money);
    }

    @Override
    public boolean addMoney(String accountNumber, double money) {
        return yesBankAPI.addMoney(accountNumber, money);
    }

}
