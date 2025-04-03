package creational.builder.example3builder;

public class MainApp {
    public static void main(String[] args) {
        Email email = new EmailBuilderImpl()
                .setSender("ghazimoradi.amin@gmail.com")
                .setReceiver("ghazimoradi.saleh@gmail.com")
                .setSubject("email test")
                .setBody("hello from email builder")
                .build();
    }
}
