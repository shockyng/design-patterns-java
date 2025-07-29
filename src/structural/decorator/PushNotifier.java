package structural.decorator;

public class PushNotifier implements Notifier {

    Notifier notifier;

    public PushNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        // send a push notification
        System.out.println("Sending push: " + message);
        if (notifier != null) notifier.send(message);
    }
}
