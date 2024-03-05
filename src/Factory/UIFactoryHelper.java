package Factory;

public class UIFactoryHelper {
    public static UIFactory getUIFactory(SupportedPlatforms platforms){
        if(platforms.equals(SupportedPlatforms.Android))
            return new AndroidUIFactory();
        else {
            return new IOSUIFactory();
        }
    }
}
