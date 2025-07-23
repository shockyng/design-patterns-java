package creational;

public class App {
    public static void main(String[] args) {
        TransportFactory factory = new CarFactory();
        Transport transport = factory.createTransport();
        transport.move();
    }
}
