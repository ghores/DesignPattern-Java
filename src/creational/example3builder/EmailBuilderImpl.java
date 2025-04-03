package creational.example3builder;

public class EmailBuilderImpl implements EmailBuilder {
    private final Email email;

    public EmailBuilderImpl() {
        this.email = new Email();
    }

    @Override
    public EmailBuilder setSender(String sender) {
        email.setSender(sender);
        return this;
    }

    @Override
    public EmailBuilder setSubject(String subject) {
        email.setSubject(subject);
        return this;
    }

    @Override
    public EmailBuilder setBody(String body) {
        email.setBody(body);
        return this;
    }

    @Override
    public EmailBuilder setReceiver(String receiver) {
        email.setReceiver(receiver);
        return this;
    }

    @Override
    public Email build() {
        return email;
    }
}
