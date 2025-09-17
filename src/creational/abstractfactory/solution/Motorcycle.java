package creational.abstractfactory.solution;

import creational.abstractfactory.solution.abstraction.Transport;

public class Motorcycle implements Transport {
    @Override
    public void move() {
        System.out.println( "Moving with motorcycle...");
    }
}
