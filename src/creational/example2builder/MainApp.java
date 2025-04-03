package creational.example2builder;

import creational.example2builder.contactus.ContactUsFormBuilder;
import creational.example2builder.interfaces.Form;

public class MainApp {
    public static void main(String[] args) {
        Form contactUsForm = new ContactUsFormBuilder()
                .setFirstName("Amin")
                .setLastName("Ghazimoradi")
                .setEmail("ghazimoradi.amin@gmail.com")
                .setPhone("09121212121")
                .build();
    }
}
