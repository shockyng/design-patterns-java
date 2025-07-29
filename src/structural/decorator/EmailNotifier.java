package structural.decorator;

public class EmailNotifier implements Notifier {

    @Override
    public void send(String message) {
        // send email
        System.out.println("Email send: " + message);
    }
}
