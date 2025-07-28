package structural.adapter;

public class App {
    public static void main(String[] args) {
        ModernEmailSender mailSender = new EmailAdapter();
        mailSender.sendEmail("Subject", "Messagfe", "test@mail.com");
    }
}
