package Factory;

public class Flutter {
    void refreshUI(){
        System.out.println("Refreshing UI......");
    }
    void setTheme(){
        System.out.println("Setting Theme....");
    }

    UIFactory createUIFactory(SupportedPlatforms platform){
        /*if(platform.equals(SupportedPlatforms.Android))
            return new AndroidUIFactory();
        else {
            return new IOSUIFactory();
        }*/
        return UIFactoryHelper.getUIFactory(platform);
    }

}
