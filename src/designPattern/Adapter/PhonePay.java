package designPattern.Adapter;

public class PhonePay {
   private OpenBankAPI openBankAPI;

   public PhonePay(OpenBankAPI openBankAPI){
       this.openBankAPI = openBankAPI;
   }

   public double showBalance(String accNum){
       return openBankAPI.checkBalance(accNum);
   }

   public boolean addMoney(String accNum, double amount){
       return openBankAPI.addMoney(accNum,amount);
   }
}
