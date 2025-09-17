package creational.abstractfactory.solution;

import creational.abstractfactory.TransportEnvironment;
import creational.abstractfactory.solution.abstraction.Factory;
import creational.abstractfactory.solution.abstraction.Transport;
import creational.abstractfactory.solution.factories.LandTransportFactory;
import creational.abstractfactory.solution.factories.SeaTransportFactory;

public class App {
    public static void main(String[] args) {
        TransportEnvironment environment = TransportEnvironment.SEA;
        Factory factory;
        Transport mainTransport;
        Transport secondaryTransport;

        factory = switch (environment) {
            case SEA -> new SeaTransportFactory();
            case LAND -> new LandTransportFactory();
        };

        mainTransport = factory.createMainTransport();
        secondaryTransport = factory.createSecondaryTransport();

        mainTransport.move();
        secondaryTransport.move();
    }
}
