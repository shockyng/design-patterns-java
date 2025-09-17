package creational.factorymethod.solution;

import creational.factorymethod.TransportEnvironment;
import creational.factorymethod.solution.abstraction.Transport;
import creational.factorymethod.solution.abstraction.TransportFactory;
import creational.factorymethod.solution.factories.CarFactory;
import creational.factorymethod.solution.factories.ShipFactory;

public class App {
    public static void main(String[] args) {
        TransportEnvironment environment = TransportEnvironment.SEA;
        TransportFactory factory;
        Transport transport;

        factory = switch (environment) {
            case SEA -> new ShipFactory();
            case LAND -> new CarFactory();
        };

        transport = factory.createTransport();
        transport.move();
    }
}
