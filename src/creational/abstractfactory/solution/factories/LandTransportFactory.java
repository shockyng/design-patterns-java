package creational.abstractfactory.solution.factories;

import creational.abstractfactory.solution.Car;
import creational.abstractfactory.solution.Motorcycle;
import creational.abstractfactory.solution.abstraction.Factory;
import creational.abstractfactory.solution.abstraction.Transport;

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
