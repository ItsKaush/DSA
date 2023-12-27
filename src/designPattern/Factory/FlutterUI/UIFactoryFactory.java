package designPattern.Factory.FlutterUI;


//This way of giving the responsibility to another class is called practical Factory
public class UIFactoryFactory {
    public static UIFactory createUIFactory(SupportedPlatform platform){
        if(platform.equals(SupportedPlatform.ANDROID)){
            return new AndroidUIFactory();
        } else if (platform.equals(SupportedPlatform.IOS)) {
            return new IosUIFactory();
        } else if (platform.equals(SupportedPlatform.Windows)) {
            return new WindowsUIFactory();
        }else{
            return null;
        }
    }
}
