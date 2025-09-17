package creational.factorymethod.solution;

import creational.factorymethod.solution.abstraction.Transport;

public class Ship implements Transport {
    @Override
    public void move() {
        System.out.println("Moving with ship...");
    }
}
