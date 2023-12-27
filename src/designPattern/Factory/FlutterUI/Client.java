package designPattern.Factory.FlutterUI;

public class Client {

    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createUIFactory(SupportedPlatform.IOS);

        Button button = uiFactory.createButton();
        button.showButton();

        Menu menu = uiFactory.createMenu();
        menu.showMenu();


    }


}
