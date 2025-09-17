package creational.factorymethod.solution;

import creational.factorymethod.solution.abstraction.Transport;

public class Car implements Transport {

    @Override
    public void move() {
        System.out.println("Moving the car...");
    }
}
