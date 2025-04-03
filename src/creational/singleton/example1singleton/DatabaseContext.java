package creational.singleton.example1singleton;

public class DatabaseContext {
    //Eager
    /*private static final DatabaseContext instance = new DatabaseContext();*/
    private static DatabaseContext instance;

    private DBConnection connection;

    private DatabaseContext() {
        connection = new DBConnection();
    }

    public static DatabaseContext getInstance() {
        if (instance == null) {
            instance = new DatabaseContext();
        }
        return instance;
    }

    public DBConnection getConnection() {
        return connection;
    }
}
