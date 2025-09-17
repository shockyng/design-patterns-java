package creational.abstractfactory.solution;

import creational.abstractfactory.solution.abstraction.Transport;

public class Car implements Transport {
    @Override
    public void move() {
        System.out.println("Moving with car...");
    }
}
