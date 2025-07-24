package creational.abstractfactory;

public class App {
    public static void main(String[] args) {
        Factory factory = new LandTransportFactory();
        Transport transport = factory.createMainTransport();
        transport.move();
    }
}
