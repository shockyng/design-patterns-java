package structural.adapter;

public interface ModernEmailSender {
    void sendEmail(String subject, String message, String sendTo);
}
