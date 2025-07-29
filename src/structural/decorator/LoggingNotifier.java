package structural.decorator;

public class LoggingNotifier implements Notifier {

    Notifier notifier;

    public LoggingNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        // register Log
        System.out.println("Logging message somewhere: " + message);
        if (notifier != null) notifier.send(message);
    }
}
