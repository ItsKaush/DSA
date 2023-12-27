package designPattern.Factory.FlutterUI;

public class Flutter {
    //Non factory methods

    public void setTheme(){
        System.out.println("Setting Themes");
    }

    public void setRefreshRate(){
        System.out.println("Setting Refresh rate");
    }

    public UIFactory createUIFactory(SupportedPlatform platform) {
        //Check the input from client which platform it is using and create the corresponding factory object
        //OCP is getting violated, if new platform is added then i will have to add new else if here
//        if(platform.equals(SupportedPlatform.ANDROID)){
//            return new AndroidUIFactory();
//        } else if (platform.equals(SupportedPlatform.IOS)) {
//            return new IosUIFactory();
//        } else if (platform.equals(SupportedPlatform.Windows)) {
//            return new WindowsUIFactory();
//        } else{
//            return null;
//        }

        //OCP is not better than before, if needed to add anew platform just need to change the UIFactoryFactory class
        return UIFactoryFactory.createUIFactory(platform);
    }
}
