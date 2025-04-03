package creational.singleton.example3singleton;

public class MainApp {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log(LogLevel.DEBUG, "Hello from debug");
        logger.log("Hello from info");
        logger.getAllLogs().forEach(System.out::println);
    }
}
