package creational.abstractfactory;

public class LandTransportFactory implements Factory {

    @Override
    public Transport createMainTransport() {
        return new Car();
    }

    @Override
    public Transport createSecondaryTransport() {
        return new Motorcycle();
    }
}
