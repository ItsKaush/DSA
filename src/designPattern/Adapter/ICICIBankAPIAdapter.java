package designPattern.Adapter;

import designPattern.Adapter.ThirdParty.ICICIBankAPI;

public class ICICIBankAPIAdapter implements OpenBankAPI{

    //will create an object of third party and call their api accordingly

    ICICIBankAPI iciciBankAPI = new ICICIBankAPI();
    @Override
    public double checkBalance(String accountNumber) {
        return iciciBankAPI.cehckBalanace(accountNumber);
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double money) {
        return iciciBankAPI.sendMoney(fromAccount,toAccount,money);
    }

    @Override
    public boolean addMoney(String accountNumber, double money) {
        return iciciBankAPI.addMoney(accountNumber, money);
    }

}
