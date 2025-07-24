package creational.abstractfactory;

public class SeaTransportFactory implements Factory {

    @Override
    public Transport createMainTransport() {
        return new Ship();
    }

    @Override
    public Transport createSecondaryTransport() {
        return new Boat();
    }
}
