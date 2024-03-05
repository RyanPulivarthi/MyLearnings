package Singleton;

public class DatabaseConnection {
    private static DatabaseConnection databaseConnection=null;
    public DatabaseConnection(){}
    public static DatabaseConnection getInstance(){
        /*if(databaseConnection==null)
            databaseConnection=new DatabaseConnection();*/
        return databaseConnection;
    }
}
