package structural.adapter;

public class EmailAdapter implements ModernEmailSender {

    private final LegacyEmailSender legacyEmailSender = new LegacyEmailSender();

    @Override
    public void sendEmail(String subject, String message, String sendTo) {
        legacyEmailSender.sendEmail(subject, message, sendTo, null);
    }
}
