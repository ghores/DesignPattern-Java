package creational.example3builder;

public interface EmailBuilder {
    EmailBuilder setSender(String sender);

    EmailBuilder setSubject(String subject);

    EmailBuilder setBody(String body);

    EmailBuilder setReceiver(String receiver);

    Email build();
}
