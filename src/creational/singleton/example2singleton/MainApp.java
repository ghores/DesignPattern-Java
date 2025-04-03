package creational.singleton.example2singleton;

public class MainApp {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        String dbHost = configManager.getProperties("db.host");
        String dbPort = configManager.getProperties("db.port");
        System.out.println("DBConnection = " + dbHost + ":" + dbPort);
    }
}
