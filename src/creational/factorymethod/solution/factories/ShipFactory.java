package creational.factorymethod.solution.factories;

import creational.factorymethod.solution.Ship;
import creational.factorymethod.solution.abstraction.Transport;
import creational.factorymethod.solution.abstraction.TransportFactory;

public class ShipFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
