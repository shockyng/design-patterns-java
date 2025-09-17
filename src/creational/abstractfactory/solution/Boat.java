package creational.abstractfactory.solution;

import creational.abstractfactory.solution.abstraction.Transport;

public class Boat implements Transport {
    @Override
    public void move() {
        System.out.println( "Moving with boat...");
    }
}
