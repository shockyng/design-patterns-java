package creational.factorymethod.solution.factories;

import creational.factorymethod.solution.Car;
import creational.factorymethod.solution.abstraction.Transport;
import creational.factorymethod.solution.abstraction.TransportFactory;

public class CarFactory implements TransportFactory {

    @Override
    public Transport createTransport() {
        return new Car();
    }
}
