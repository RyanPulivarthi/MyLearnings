package Singleton;

public class Client {
    public static void main(String[] args) {
        DatabaseConnection db=DatabaseConnection.getInstance();
        System.out.println(db);
    }
}
