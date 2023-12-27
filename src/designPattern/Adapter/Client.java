package designPattern.Adapter;

public class Client {
    public static void main(String[] args) {
        PhonePay phonePay = new PhonePay(new YesBankAPIAdapter());
        System.out.println(phonePay.showBalance("accNum"));
    }
}
