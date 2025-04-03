package creational.example2builder;

import creational.example2builder.contactus.ContactUsFormBuilder;
import creational.example2builder.interfaces.Form;

public class MainApp {
    public static void main(String[] args) {
        Form contactUsForm = new ContactUsFormBuilder()
                .setFirstName("Hossein")
                .setLastName("Badrnezhad")
                .setEmail("hossein@holosen.net")
                .setPhone("09121212121")
                .build();
    }
}
