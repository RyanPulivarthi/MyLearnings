package Factory;

public class Client {
    public static void main(String[] args) {
        Flutter flutter=new Flutter();
        UIFactory factory= flutter.createUIFactory(SupportedPlatforms.Android);

        Button button=factory.createButton();
        button.showButton();

        Menu menu=factory.createMenu();
        menu.showMenu();

        flutter.refreshUI();

    }
}
