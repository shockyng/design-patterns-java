package creational.abstractfactory.solution.factories;

import creational.abstractfactory.solution.Boat;
import creational.abstractfactory.solution.Ship;
import creational.abstractfactory.solution.abstraction.Factory;
import creational.abstractfactory.solution.abstraction.Transport;

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
