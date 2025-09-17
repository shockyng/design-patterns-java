package creational.abstractfactory.problem;

import creational.abstractfactory.TransportEnvironment;

public class App {
    public static void main(String[] args) {
        TransportEnvironment environment = TransportEnvironment.SEA;

        switch (environment) {
            case SEA:
                Ship ship = new Ship();
                ship.move();

                Boat boat = new Boat();
                boat.move();
                break;
            case LAND:
                Car car = new Car();
                car.move();

                Motorcycle motorcycle = new Motorcycle();
                motorcycle.move();
                break;
        }
    }
}