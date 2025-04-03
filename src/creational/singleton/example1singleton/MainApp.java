package creational.singleton.example1singleton;

public class MainApp {
    public static void main(String[] args) {
        DatabaseContext context = DatabaseContext.getInstance();
        context.getConnection();
    }
}
