package designPattern.Factory.FlutterUI;

public class AndroidButton implements Button{
    @Override
    public void showButton() {
        System.out.println("Showing Android Button");
    }
}
