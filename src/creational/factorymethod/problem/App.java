package creational.factorymethod.problem;

import creational.factorymethod.TransportEnvironment;

public class App {
    public static void main(String[] args) {
        TransportEnvironment environment = TransportEnvironment.SEA;

        switch (environment) {
            case SEA:
                Ship ship = new Ship();
                ship.move();
                break;
            case LAND:
                Car car = new Car();
                car.move();
        }
    }
}
