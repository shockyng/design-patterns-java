package structural.decorator;

public class App {
    public static void main(String[] args) {
        Notifier notifier = new LoggingNotifier(new PushNotifier(new EmailNotifier()));
        notifier.send("Hello");
    }
}