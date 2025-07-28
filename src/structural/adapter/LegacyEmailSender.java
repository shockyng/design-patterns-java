package structural.adapter;

import java.util.Properties;

public class LegacyEmailSender {
    void sendEmail(String subject, String message, String sendTo, @Deprecated Properties properties) {
        // ...
        System.out.println("Email sent");
    }
}
