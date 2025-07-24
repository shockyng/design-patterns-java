package creational.factorymethod;

public class CarFactory implements TransportFactory {

    @Override
    public Transport createTransport() {
        return new Car();
    }
}
